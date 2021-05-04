package kodlamaIo;

public class User {

	public User() {
	}

	public User(int id, String name, String surname, String email, String password) {
		this();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;

	}

	int id;
	String name;
	String surname;
	String email;
	String password;

}
