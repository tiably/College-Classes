public class Demo 
{
	public static void main(String[] args) 
	{	
		//create objects
		
		Person person = new Person("John", "Smith", "jsmith@strose.edu", "5181234567");
		Graduate graduate = new Graduate("Jane", "Doe", "jdoe@strose.edu", "5180987654", "MS", "Dr. A");
		Undergraduate undergraduate = new Undergraduate("Joe", "Smoe", "jsmoe@strose.edu", "5182468102", "Dr. B");
		
		//call writeOutput methods for all objects and toString for person
		person.writeOutput();	
		System.out.println(person.toString());
		graduate.writeOutput();
		undergraduate.writeOutput();
	}
}
