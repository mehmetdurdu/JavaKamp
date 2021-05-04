package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Mehmet","Durdu","mehmet@mehmet.com","1234");
		User user2 = new User(2,"Ahmet","Dursun","ahmet@ahmet.com","4321");
		User user3 = new User(3,"Ali","Dumlu","ali@ali.com","2580");
		
		User[] users = {user1, user2, user3};
		
		for (User user : users) {
			
			System.out.println(user.name+" "+user.surname+"\n"+user.email+"->"+user.password);
			System.out.println("-------------------");
		}
		
		UserManager userManager = new UserManager();
		userManager.loginToCourse(user1);
		userManager.loginToCourse(user2);
		userManager.loginToCourse(user3);
		
		Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)","Engin Demirog","9.01.2021",100);
		Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","Engin Demirog","21.04.2021",40);
		Course course3 = new Course(3,"Yazılım Geliştirici Yetiştirme Kampı (Pyton)","Engin Demirog","9.01.2021",90);
		
		Course[] course = {course1, course2, course3};
		
		for (Course courses : course) {
			
			System.out.println(courses.courseName+"---->"+courses.date);
			System.out.println("---------------------");
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.completionOfCourse(course1);
		courseManager.completionOfCourse(course2);
		courseManager.completionOfCourse(course3);
		courseManager.finishAndContinue();
		courseManager.lastLesson();
		courseManager.previousLesson();
		courseManager.startAssigment();

	}

}
