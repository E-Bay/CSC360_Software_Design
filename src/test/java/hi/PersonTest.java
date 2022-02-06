package hi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest
{
	Person R;
	Person J;
	Person M;
	Person Y;
	
	@BeforeEach
	void setUp() throws Exception
	{
		R = new Person("Romeo", "Mon", 15);
		J = new Person("Juliet", "Cap", 13);
		M = new Person("Count", "Dookuu", 54);
		Y = new Person("Yo", "Da", 973);
	}
	
	@Test
	void testToString()
	{
		assertEquals(R.toString(), "Person: Romeo Mon, 15");
		//fail("Not yet implemented");
	}
	
	@Test
	void testPerson()
	{
		
		assertThrows(UnderAgeException.class,
				()->{
					R.makePerson(J);
				});
		assertThrows(UnderAgeException.class,
				()->{
					M.makePerson(J);
				});
		
		Person child;
		try
		{
			child = M.makePerson(Y);
			
			assertEquals(M.getfName(), child.getfName());
			assertEquals(Y.getlName(), child.getlName());
			assertEquals(0, child.getAge());
		} catch (UnderAgeException e)
		{
			e.printStackTrace();
			fail("threw exception");
		}
		

	}

}
