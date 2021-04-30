package kodlamaioInheritance;

public class Instructor extends User {
	
	String InstructorSertificate;
	
	public Instructor() {
		
	}

	public Instructor(int id,String userName,String lastName,String InstructorSertificate) {
		super(id,userName,lastName);
		this.InstructorSertificate = InstructorSertificate;
	}

	public String getInstructorSertificate() {
		return InstructorSertificate;
	}

	public void setInstructorSertificate(String instructorSertificate) {
		InstructorSertificate = instructorSertificate;
	}
	

}
