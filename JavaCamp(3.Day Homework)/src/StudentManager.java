import org.graalvm.compiler.nodes.InliningLog.UpdateScope;

public class StudentManager {
	public void Add(Student student) {
		System.out.println(student.Name + ", Kaydoldunuz ");

	}

	public void AddCourse(Student student) {
		System.out.println(student.Name + "," + " Kurs'a Kaydoldunuz ");

	}

	public void DeleteCourse(Student student) {
		System.out.println(student.Name + " Kurs'dan Çıktınız ");

	}

	public void Update(Student student) {
		System.out.println(student.E_Mail + " Olarak Güncellendi");

	}

}
