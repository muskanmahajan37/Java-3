
public class Instructor extends User {
	
	
	
	private String Courses;
	private int Student_Count; // Daha fazla nitelik olmasý için Eklendi
	private String Description;
	

	public Instructor(int id, String name, String lastName, String e_Mail, String description) {
		super(id, name, lastName, e_Mail);

		Description = description;
	}


	public String getCourses() {
		return Courses;
	}


	public void setCourses(String courses) {
		Courses = courses;
	}


	public int getStudent_Count() {
		return Student_Count;
	}


	public void setStudent_Count(int student_Count) {
		Student_Count = student_Count;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}

}
