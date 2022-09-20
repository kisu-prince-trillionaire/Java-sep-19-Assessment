package main.services.phone.dimart;

import java.util.Scanner;

public class Login {
	private String userName;
	private String password;

	public Login() {
		System.out.println("Try logging in with the right credentials !");
	}

	public Login(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void login() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your username : ");
			this.userName = sc.nextLine();
			System.out.println("Enter your password : ");
			this.password = sc.nextLine();
			System.out.println("Login Successful");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
