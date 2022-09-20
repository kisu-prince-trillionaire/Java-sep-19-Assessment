package main.services.phone.dimart;

import java.util.Scanner;

public class Registration {
	private String name;
	private String email;
	private long phoneNo;

	public Registration() {
		System.out.println("Try registering with the right credentials !");
	}

	public Registration(String name, String email, long phoneNo) {
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void register() {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Registration page");
			System.out.print("Enter your name:");
			String name = sc.nextLine();
			System.out.print("Enter your email id: ");
			String email = sc.nextLine();
			System.out.print("Enter your mobile number: ");
			double phoneNo = sc.nextLong();
			System.out.println("Name : " + name + " Email : " + email + " Phone No : " + phoneNo);
			System.out.println("\n Hello " + name + " ! \n Registration successful");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
