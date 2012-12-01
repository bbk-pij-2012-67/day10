public interface LibraryUserInterface{

	/**
	* @return library users name.
	*/
	String getName();

	/**
	* @return library ID number.
	*/
	int getLibraryID();

	/**
	* Set ID number
	*/
	void setLibraryID(int ID);

	/**
	* @return library ID number.
	*/
	int register(Library library);

	/**
	* @return library name.
	*/
	String getLibrary();


}