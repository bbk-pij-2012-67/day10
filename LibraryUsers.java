public class LibraryUsers implements LibraryUsersInterface{

	private LibraryUser InitialUser;
	private int maxID;

	public LibraryUsers(){
		InitialUser = null;
		maxID = 0;
	}

	private int add(String name){
		if(InitialUser == null){
			InitialUser = new LibraryUser(name);
			InitialUser.setLibraryID(maxID+1);
			InitialUser.setNext(null);
		}else{
			LibraryUser currentUser = InitialUser;
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
		LibraryUser currentUser = InitialUser;
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
}