

public class StudentManager {
	public void Add(Student student) {
		System.out.println(student.getName() + ", Kaydoldunuz ");

	}

	public void AddCourse(Student student) {
		System.out.println(student.getName() + "," + " Kurs'a Kaydoldunuz ");

	}

	public void DeleteCourse(Student student) {
		System.out.println(student.getName() + " Kurs'dan Çıktınız ");

	}

	public void Update(Student student) {
		System.out.println(student.getE_Mail() + " Olarak Güncellendi");

	}

}
