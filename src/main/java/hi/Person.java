package hi;

public class Person
{
	String firstName;
	String lastName;
	int age;
	
	/**
	 * @param fName - First Name
	 * @param lName - Last Name
	 * @param age - Age of person in years
	 */
	public Person(String fName, String lName, int age)
	{
		this.firstName = fName;
		this.lastName = lName;
		this.age = age;
	}

	/**
	 * @return the fName
	 */
	public String getfName()
	{
		return firstName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName)
	{
		this.firstName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName()
	{
		return lastName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName)
	{
		this.lastName = lName;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Person: "+ firstName + " " + lastName + ", " + age;
	}
	
	public Person makePerson(Person that) throws UnderAgeException
	{
		if (age < 18 || that.age < 18)
		{
			throw new UnderAgeException();
		}
		Person child = new Person(this.firstName, that.lastName, 0);
		return child;
	}
	
	public static void main(String[] args)
	{
		Person p = new Person("Bob", "Joh", 32);
		
		System.out.println(p);
	}
	
}
