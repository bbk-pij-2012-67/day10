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
		int myID1 = library.getId("Edmund White");
		int myID2 = library.getId("Joshua White");
		int myID3 = library.getId("Carolann White");
		int myID4 = library.getId("Carolann White");
		assertTrue(myID1 != myID2);
		assertTrue(myID1 != myID3);
		assertTrue(myID3 != myID2);
		assertTrue(myID3 == myID4);
	}

	@Test
	public void TestsAddTakeBook(){
		Library library = new Library("Library name");
		library.addBook("Title1", "Author1");
		library.addBook("Title2", "Author2");
		library.addBook("Title3", "Author3");
		library.addBook("Title4", "Author4");

		assertTrue(library.takeBook("Title1").getTitle().equals("Title1"));
		assertTrue(library.takeBook("Title2").getTitle().equals("Title2"));
		assertTrue(library.takeBook("Title3").getTitle().equals("Title3"));
		assertTrue(library.takeBook("Title4").getTitle().equals("Title4"));
	}

	@Test
	public void TestsTaken(){
		Library library = new Library("Library name");
		library.addBook("Title1", "Author1");
		library.addBook("Title2", "Author2");
		library.addBook("Title3", "Author3");
		library.addBook("Title4", "Author4");

		Book takenBook  = library.takeBook("Title1");
		assertEquals(true,takenBook.getIsTaken());
		Book takenBook2  = library.takeBook("Title1");

		assertTrue(takenBook2 == null);

	}

	@Test
	public void TestsReturn(){
		Library library = new Library("Library name");
		library.addBook("Title1", "Author1");
		library.addBook("Title2", "Author2");
		library.addBook("Title3", "Author3");
		library.addBook("Title4", "Author4");

		Book takenBook  = library.takeBook("Title1");
		assertTrue(takenBook.getIsTaken());
		library.returnBook(takenBook);
		assertFalse(takenBook.getIsTaken());
	}

	@Test
	public void TestsBookCount(){
		Library library = new Library("Library name");
		for(int c=1;c<=100;c++){
			String title = Double.toString(Math.random());
			String author = Double.toString(Math.random());
			library.addBook(title,author);
			assertEquals(c,library.getBookCount());
		}
	}

	@Test
	public void testsReaderCount(){
		Library library = new Library("Library name");
		for(int c=1;c<=100;c++){
			int myID = library.getId(Double.toString(Math.random()));
			assertEquals(c,library.getReaderCount());
		}
	}

	@Test
		public void TestsBookBorrowedCount(){
			Library library = new Library("Library name");
			int borrowedCount = 0;
			for(int c=1;c<=100;c++){
				String title = Double.toString(Math.random());
				String author = Double.toString(Math.random());
				library.addBook(title,author);
				if(c%3 == 0){
					library.takeBook(title);
					borrowedCount++;
				}
				assertEquals(borrowedCount,library.getBookBorrowedCount());
			}
	}



}