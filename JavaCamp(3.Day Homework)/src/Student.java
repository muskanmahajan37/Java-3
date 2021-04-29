
public class Student extends User {

	public Student(int id, String name, String lastName, String e_Mail) {
		super(id, name, lastName, e_Mail);

	}

	private String[] Courses;
	private String Address;
	private String Credit_Card;
	
	
	public String[] getCourses() {
		return Courses;
	}
	public void setCourses(String[] courses) {
		Courses = courses;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCredit_Card() {
		return Credit_Card;
	}
	public void setCredit_Card(String credit_Card) {
		Credit_Card = credit_Card;
	}

}
