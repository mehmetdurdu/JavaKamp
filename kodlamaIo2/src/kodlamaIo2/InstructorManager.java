package kodlamaIo2;

public class InstructorManager extends UserManager{

	public void CreatedCourse(Instructor instructor) {

		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli e?itmen "
				+ instructor.getCreatedCourse() + " isimli kursu olu?turdu ");
	}

}
