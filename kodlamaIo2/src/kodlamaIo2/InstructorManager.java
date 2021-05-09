package kodlamaIo2;

public class InstructorManager extends UserManager{

	public void CreatedCourse(Instructor instructor) {

		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli eðitmen "
				+ instructor.getCreatedCourse() + " isimli kursu oluþturdu ");
	}

}
