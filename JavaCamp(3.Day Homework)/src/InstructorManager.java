
public class InstructorManager {
	public void Add(Instructor instructor) {
		System.out.println("Yeni Egitmen Eklendi: " + instructor.Name);
	}

	public void Delete(Instructor instructor) {
		System.out.println(" Egitmen Silindi: " + instructor.Name);
	}

	public void GetInfo(Instructor instructor) {
		System.out.println("Egitmen Bilgisi: " + instructor.Description);
	}
}
