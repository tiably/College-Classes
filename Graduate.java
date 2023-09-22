
public class Graduate extends Person
{
	private String degreeType;
	private String advisorName; 
	
	public Graduate()		//Default Constructor
	{
		super();
		degreeType = "none";
		advisorName = "none";
	}
	public Graduate (String firstName, String lastName, String email, String phone, String degreeType, String advisorName)		//Constructor for all variables
	{
		super(firstName, lastName, email, phone);
		this.degreeType = degreeType;
		this.advisorName = advisorName;
	}
	
	public void writeOutput()		//writeOutput method
	{
		System.out.println("Graduate First Name: " + getFirstName());
		System.out.println("Graduate Last Name: " + getLastName());
		System.out.println("Graduate Email: " + getEmail());
		System.out.println("Graduate Phone: " + getPhone());
		System.out.println("Graduate Degree Type: " + getDegreeType());
		System.out.println("Graduate Advisor Name: " + getAdvisorName());
	}
	
	//getters and setters
	
	public String getDegreeType()
	{
		return degreeType;
	}
	public void setDegreeType(String degreeType)
	{
		this.degreeType = degreeType;
	}
	public String getAdvisorName()
	{
		return advisorName;
	}
	public void setAdvisorName(String advisorName)
	{
		this.advisorName = advisorName;
	}
}
