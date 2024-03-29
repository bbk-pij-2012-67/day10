public class BookList{

	private Book firstBook;

	public BookList(){
		firstBook = null;
	}

	public void add(String title, String author){
		Book newBook = new Book(title,author);
		if(firstBook == null){
			firstBook = newBook;
			firstBook.setNext(null);
		}else{
			Book currentBook = firstBook;
			//find last book added
			while(currentBook.getNext() != null){
				currentBook = currentBook.getNext();
			}
			currentBook.setNext(newBook);
			currentBook.getNext().setNext(null);
		}

	}

	public Book getBook(String title){
		Book result;
		Book currentBook = firstBook;
		while(currentBook !=null && !currentBook.getTitle().equals(title)){
			currentBook = currentBook.getNext();
		}
		return currentBook;
	}

	public int getBookCount(){
		int result = 0;
		Book currentBook = firstBook;
		while (currentBook != null){
			currentBook = currentBook.getNext();
			result++;
		}
		return result;
	}

	public int getBookBorrowedCount(){
			int result = 0;
			Book currentBook = firstBook;
			while (currentBook != null){
				Book prevBook= currentBook;
				currentBook = currentBook.getNext();
				if(prevBook.getIsTaken()){
					result++;
				}
			}
			return result;
	}
}