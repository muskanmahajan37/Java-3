
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "C#", "Engin Demiroð");
		Course course2 = new Course(2, "Java", " Kerem Varýþ");
		Course course3 = new Course(3, "HTML+CSS", " Mehmet Karakaþ");
		Category category1 = new Category(1, "Backend Programlama");
		Category category2 = new Category(2, "Frontend Programlama");
		CategoryManager categoryManager = new CategoryManager();
		CourseManager courseManager = new CourseManager();

		Course[] course = { course1, course2, course3 };
		Category[] category = { category1, category2 };

		for (Course kurs : course) {
			System.out.println(kurs.Name);
			System.out.println("---------------------");

		}
		for (Category kategori : category) {
			System.out.println(kategori.Name);
			System.out.println("---------------------");
		}
		categoryManager.Add(category1);
		courseManager.Add(course1);

	}

}
