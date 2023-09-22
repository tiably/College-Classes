public class Person 
{
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public Person ()	//Default Constructor
	{
		firstName = "none";
		lastName = "none";
		email = "none";
		phone = "none";
	}
	
	public Person (String firstName, String lastName, String email, String phone)		//Constructor for four Strings
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
	public String toString()		//toString method 
	{
		return "First name: " + firstName + "\nLast name: " + lastName + "\nEmail: " + email + "\nPhone: " + phone;
	}
	
	public void setPerson(String firstName, String lastName, String email, String phone)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}
	
	public void writeOutput()
	{
		System.out.println("Person First Name: " + firstName);
		System.out.println("Person Last Name: " + lastName);
		System.out.println("Person Email: " + email);
		System.out.println("Person Phone: " + phone);
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPhone() 
	{
		return phone;
	}
	
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
}
