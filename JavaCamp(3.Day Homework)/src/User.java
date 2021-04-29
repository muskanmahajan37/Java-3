
public class User {

	public User(int id, String name, String lastName, String e_Mail) {
		super();
		Id = id;
		Name = name;
		LastName = lastName;
		E_Mail = e_Mail;
	}

	int Id;
	private String Name;
	private String LastName;
	private String E_Mail;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getE_Mail() {
		return E_Mail;
	}
	public void setE_Mail(String e_Mail) {
		E_Mail = e_Mail;
	}

}
