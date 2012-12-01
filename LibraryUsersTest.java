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
}