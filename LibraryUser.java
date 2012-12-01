public class LibraryUser{

	private String name;
	private int libraryID;
	private Library library;
	private LibraryUser next;

	public LibraryUser(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}


	public int getLibraryID(){
		return this.libraryID;
	}


	public void setLibraryID(int ID){
		this.libraryID = ID;
	}

	public int register(Library library){
		this.library = library;
		return library.getLibraryUserID();
	}

	public String getLibrary(){

		return library.getLibraryName();
	}

	public LibraryUser getNext(){
		return next;
	}

	public void setNext(LibraryUser next){
		this.next = next;
	}
}