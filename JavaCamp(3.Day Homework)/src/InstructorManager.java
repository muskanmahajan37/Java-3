
public class InstructorManager {
	public void Add(Instructor instructor) {
		System.out.println("Yeni Egitmen Eklendi: " + instructor.getName());
	}

	public void Delete(Instructor instructor) {
		System.out.println(" Egitmen Silindi: " + instructor.getName());
	}

	public void GetInfo(Instructor instructor) {
		System.out.println("Egitmen Bilgisi: " + instructor.getDescription());
	}
}
