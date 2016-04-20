import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import net.pritesh.service.CustomerService;
import net.pritesh.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"net.pritesh"})
public class AppConfig
{
	@Bean(name="customerService")
	@Scope("singleton")
	public CustomerService getCustomerService()
	{
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository()
//	{
//		return new HibernateCustomerRepositoryImpl();
//	}

}
