public class Undergraduate extends Person
{
	private String advisorName;
	
	public Undergraduate()		//Default Constructor
	{
		super();
		advisorName = "none";
	}
	
	public Undergraduate(String firstName, String lastName, String email, String phone, String advisorName)			//Constructor for all variables
	{
		super(firstName, lastName, email, phone);
		this.advisorName = advisorName;
	}
	
	public void writeOutput()		//writeOutput method
	{
		System.out.println("Undergraduate First Name: " + getFirstName());
		System.out.println("Undergraduate Last Name: " + getLastName());
		System.out.println("Undergraduate Email: " + getEmail());
		System.out.println("Undergraduate Phone: " + getPhone());
		System.out.println("Undergraduate Advisor Name: " + getAdvisorName());
	}
	
	//getters and setters
	
	public String getAdvisorName()
	{
		return advisorName;
	}
	public void setAdvisorName(String advisorName)
	{
		this.advisorName = advisorName;
	}
}
