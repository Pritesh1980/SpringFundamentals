import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.pritesh.service.CustomerService;

public class Application
{

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//CustomerService service = new CustomerServiceImpl();
		CustomerService service = context.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0));

	}

}
