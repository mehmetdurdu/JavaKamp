package kodlamaIo2;

public class StudentManager extends UserManager {
	public void chooseCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli ��renci "
				+ student.getCourseName() + " isimli kursa kay�t oldu. ");
	}

}
