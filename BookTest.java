import org.junit.*;
import static org.junit.Assert.*;

public class BookTest{
//tests that it returns what was initialised
	@Test
	public void testsConstructor(){
		for(int c=1;c<=100;c++){
			String bookTitle = Double.toString(Math.random());
			String bookAuthor = Double.toString(Math.random()*10);
			Book book = new Book(bookTitle,bookAuthor);
			assertTrue(book.getTitle().equals(bookTitle));
			assertTrue(book.getAuthor().equals(bookAuthor));
		}
	}
}