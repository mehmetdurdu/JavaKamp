package kodlamaIo2;

public class UserManager {

	public void Login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " giri� yap�ld� ");
	}

	public void Logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ��k�� yap�ld�");
	}

}
