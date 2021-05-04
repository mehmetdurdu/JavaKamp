package kodlamaIo2;

public class Main {

	public static void main(String[] args) {

		Student student = new Student(1, "Mehmet", "Durdu", "C# - ANGULAR");
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "C# - ANGULAR");

		StudentManager studentManager = new StudentManager();
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();

		userManager.Login(instructor);
		instructorManager.CreatedCourse(instructor);
		userManager.Logout(instructor);

		userManager.Login(student);
		studentManager.chooseCourse(student);
		userManager.Logout(student);

	}

}
