package kodlamaIo;

public class CourseManager {
	
	public void lastLesson() {
		System.out.println("Sonraki Derse Gec");
	}
	
	public void previousLesson() {
		System.out.println("�nceki Derse Gec");
	}
	
	public void startAssigment() {
		System.out.println("Ba�la");
	}
	
	public void completionOfCourse(Course course) {
		System.out.println(course.completion+"% TAMAMLANDI");
	}
	
	public void finishAndContinue() {
		System.out.println("Bitir ve devam et");
	}

}
