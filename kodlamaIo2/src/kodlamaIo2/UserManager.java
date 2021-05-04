package kodlamaIo2;

public class UserManager {

	public void Login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " giriþ yapýldý ");
	}

	public void Logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " çýkýþ yapýldý");
	}

}
