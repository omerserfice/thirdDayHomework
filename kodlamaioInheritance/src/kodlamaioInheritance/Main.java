package kodlamaioInheritance;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor =new Instructor();
		instructor.setId(0);
		instructor.setUserName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setInstructorSertificate("PMP ITIL");
		
      Student student = new Student(2, "Ömer","Serfice", "omer58", "13124");
		
		User[] users = {instructor, student};
		
		for(User user : users) {
			System.out.println(user.getUserName()+" "+user.getLastName());
		}
		
		System.out.println(" ");
		
		UserManager userManager = new UserManager();
		
		User[] users2 = {instructor, student};
		
		userManager.multipleSave(users2);
		
	}

}
