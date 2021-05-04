package kodlamaIo;


public class Course {
	
	public Course() {}
	
	public Course(int id, String courseName, String instructorName, String date, int completion) {
		
		this.id = id;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.date = date;
		this.completion = completion;
		
	}
	
	int id;
	String courseName;
	String instructorName;
	String date;
	int completion;
	

}
