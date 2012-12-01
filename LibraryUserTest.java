import org.junit.*;
import static org.junit.Assert.*;

public class LibraryUserTest{

	@Test
	public void testsName(){
		for(int c=1;c<=1000;c++){
			String name = Double.toString(Math.random());
			LibraryUser luser = new LibraryUser(name);
			assertTrue(luser.getName().equals(name));
		}
	}

	@Test
	public void testsMaxBooksPerUser(){
		for(int c=1;c<=1000;c++){
			String name = Double.toString(Math.random());
			LibraryUser luser = new LibraryUser(name);
			int myID = (int)(Math.random()*2000);
			luser.setLibraryID((int)(myID));
			assertEquals(luser.getLibraryID(),myID);
		}
	}

	@Test
	public void testsRegister(){
		Library library = new Library();
		for(int c=1;c<=1000;c++){
			String name = Double.toString(Math.random());
			LibraryUser luser = new LibraryUser(name);
			int myID = luser.register(library);
			assertEquals(myID,10);
		}
	}
}
