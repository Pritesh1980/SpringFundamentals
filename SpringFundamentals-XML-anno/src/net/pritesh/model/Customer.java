package net.pritesh.model;

public class Customer
{
	private String	firstname;
	private String	lastname;

	public final String getFirstname()
	{
		return firstname;
	}

	public final String getLastname()
	{
		return lastname;
	}

	public final void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public final void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	@Override
	public String toString()
	{
		return "Customer [firstname=" + firstname + ", lastname=" + lastname
				+ "]";
	}

}
