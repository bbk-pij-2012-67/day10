import org.junit.*;
import static org.junit.Assert.*;

public class LibraryUsersTest{

	@Test
	public void testsGetId(){
		LibraryUsers users = new LibraryUsers();
		int myID = users.getId("Edmund White");
		assertEquals(users.getId("Edmund White"),myID);
		int myID2 = users.getId("Edmund White");
		assertEquals(users.getId("Edmund White"),myID);
	}

	@Test
	public void testsGetUserCount(){
		LibraryUsers users = new LibraryUsers();
		for(int c=1;c<=100;c++){
			int myID = users.getId(Double.toString(Math.random()));
			assertEquals(c,users.getUserCount());
		}
	}

}