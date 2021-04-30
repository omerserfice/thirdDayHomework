package kodlamaioInheritance;

public class UserManager {

	public void userSave(User user) {
		System.out.println(user.getUserName() + "kaydedildi");
	}
	
	public void multipleSave(User[] users) {
		
		for(User user : users) {
			userSave(user);
		}
	}
	
	
}
