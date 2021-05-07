

public class Main {

	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();

		User user1 = new User(1, "Mehmet", "Karakaş", "123@gmail.com");
		Student student1 = new Student(2, "Mahmut", "akdeniz", "exaple@windowslive.com");
		Instructor instructor1 = new Instructor(3, "Engin", "Demiroğ", "Engin@hotmail.com",
				"MCT ve PMP Sertifikalarına sahibim ");

		studentManager.Add(student1);
		userManager.Add(user1);
		instructorManager.Add(instructor1);
		instructorManager.GetInfo(instructor1);

		User[] users = { user1, student1, instructor1 };

		for (User person : users) {
			System.out.println(person.getName());
		}

	}

}
