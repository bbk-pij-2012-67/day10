/**
* Library object
*/

public class Library{

	private String name;
	private int maxBooksPerUser;
	private LibraryUsers libraryUsers;
	private BookList bookList;



	public Library(String name){
		this.name = name;
		libraryUsers = new LibraryUsers();
		bookList = new BookList();
	}

	public int getMaxBooksPerUser(){
		return maxBooksPerUser;
	}

	public void setMaxBooksPerUser(int maxBooksPerUser){
		this.maxBooksPerUser = maxBooksPerUser;
	}

	public String getLibraryName(){
		return this.name;
	}

	//public int getLibraryUserID(){
	//	return 10;
	//}

	public int getId(String name){
		return libraryUsers.getId(name);

	}

	public void addBook(String title, String author){
		bookList.add(title,author);
	}

	//returns null is the book is already taken
	public Book takeBook(String title){
		Book result = null;
		Book foundBook = bookList.getBook(title);
		if (foundBook != null){
			if (!foundBook.getIsTaken()){
				foundBook.setIsTaken(true);
				result = foundBook;
			}
		}
		return result;
	}

	public void returnBook(Book book){
		book.setIsTaken(false);

	}

	public int getReaderCount(){
		return libraryUsers.getUserCount();
	}

	public int getBookCount(){
		return bookList.getBookCount();
	}

	public int getBookBorrowedCount(){
			return bookList.getBookBorrowedCount();
	}
}