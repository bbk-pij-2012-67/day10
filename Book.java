public class Book implements BookInterface{



	private final String title;
	private final String author;
	private boolean isTaken;
	private Book next;

	public Book(String title, String author){
		this.title = title;
		this.author = author;
		isTaken = false;
		next = null;
	}

	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return author;
	}

	public void setNext(Book newBook){
		this.next = newBook;
	}

	public Book getNext(){
		return next;
	}

	public void setIsTaken(boolean isTaken){
		this.isTaken = isTaken;
	}

	public boolean getIsTaken(){
		return this.isTaken;
	}
}