package kodlamaIo;

public class CourseManager {
	
	public void lastLesson() {
		System.out.println("Sonraki Derse Gec");
	}
	
	public void previousLesson() {
		System.out.println("Önceki Derse Gec");
	}
	
	public void startAssigment() {
		System.out.println("Baþla");
	}
	
	public void completionOfCourse(Course course) {
		System.out.println(course.completion+"% TAMAMLANDI");
	}
	
	public void finishAndContinue() {
		System.out.println("Bitir ve devam et");
	}

}
