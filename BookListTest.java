import org.junit.*;
import static org.junit.Assert.*;

public class BookListTest{

	@Test
	public void TestsBookList(){
		BookList myList = new BookList();

		myList.add("Title1", "Author1");
		myList.add("Title2", "Author2");
		myList.add("Title3", "Author3");
		myList.add("Title4", "Author4");
		myList.add("Title5", "Author5");
		myList.add("Title6", "Author6");

		assertTrue(myList.getBook("Title2").getTitle().equals("Title2"));
		assertTrue(myList.getBook("Title4").getTitle().equals("Title4"));
		assertTrue(myList.getBook("Title6").getTitle().equals("Title6"));
		assertTrue(myList.getBook("Title2").getAuthor().equals("Author2"));
		assertTrue(myList.getBook("Title4").getAuthor().equals("Author4"));
		assertTrue(myList.getBook("Title6").getAuthor().equals("Author6"));
	}

	@Test
	public void TestGetBookCount(){
		BookList myList = new BookList();
		for(int c=1;c<=100;c++){
			String title = Double.toString(Math.random());
			String author = Double.toString(Math.random());
			myList.add(title,author);
			assertEquals(c,myList.getBookCount());
		}
	}


	}
}