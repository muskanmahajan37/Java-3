
public class Instructor extends User {
	String Courses;
	int Student_Count; // Daha fazla nitelik olmasý için Eklendi
	String Description;

	public Instructor(int id, String name, String lastName, String e_Mail, String description) {
		super(id, name, lastName, e_Mail);

		Description = description;
	}

}
