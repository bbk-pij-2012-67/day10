public class LibraryUsers implements LibraryUsersInterface{

	private LibraryUser initialUser;
	private int maxID;

	public LibraryUsers(){
		initialUser = null;
		maxID = 0;
	}

	private int add(String name){
		if(initialUser == null){
			initialUser = new LibraryUser(name);
			initialUser.setLibraryID(maxID+1);
			initialUser.setNext(null);
		}else{
			LibraryUser currentUser = initialUser;
			//find last user added
			while(currentUser.getNext() != null){
				currentUser = currentUser.getNext();
			}
			currentUser.setNext(new LibraryUser(name));
			currentUser.getNext().setLibraryID(maxID+1);
			currentUser.getNext().setNext(null);
		}
		maxID++;
		return maxID;
	}



	public int getId(String name){
		//search for name
		int result;
		LibraryUser currentUser = initialUser;
		while(currentUser != null && !currentUser.getName().equals(name)){
			currentUser = currentUser.getNext();
		}
		if(currentUser == null){
			//no user found. create a user
			result = add(name);
		}else{
			//User has been found
			result = currentUser.getLibraryID();
		}


		return result;
	}

	public int getUserCount(){
		int result = 0;
		LibraryUser currentUser = initialUser;
		while(currentUser != null){
			currentUser = currentUser.getNext();
			result ++;
		}
		return result;
	}
}