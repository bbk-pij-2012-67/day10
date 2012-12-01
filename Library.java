/**
* Library object
*/

public class Library{

	private String name;
	private int maxBooksPerUser;
	private LibraryUsers libraryUsers;


	public Library(String name){
		this.name = name;
		libraryUsers = new LibraryUsers();
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

	public int getLibraryUserID(){
		return 10;
	}

	public int getID(String name){
		return libraryUsers.getId(name);

	}
}