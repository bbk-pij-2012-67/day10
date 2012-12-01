import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest{

	@Test
	public void testsName(){
		for(int c=1;c<=1000;c++){
			String name = Double.toString(Math.random());
			Library library = new Library(name);
			assertTrue(library.getLibraryName().equals(name));
		}
	}

	@Test
	public void testsMaxBooksPerUser(){
		for(int c=1;c<=1000;c++){
			String name = Double.toString(Math.random());
			Library library = new Library(name);
			int myID = (int)(Math.random()*2000);
			library.setMaxBooksPerUser((int)(myID));
			assertEquals(library.getMaxBooksPerUser(),myID);
		}
	}

	@Test
	public void testsGetId(){
		Library library = new Library("Library name");
		int myID1 = library.getID("Edmund White");
		int myID2 = library.getID("Joshua White");
		int myID3 = library.getID("Carolann White");
		int myID4 = library.getID("Carolann White");
		assertTrue(myID1 != myID2);
		assertTrue(myID1 != myID3);
		assertTrue(myID3 != myID2);
		assertTrue(myID3 == myID4);
	}
}