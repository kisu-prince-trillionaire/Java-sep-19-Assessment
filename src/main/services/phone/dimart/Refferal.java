package main.services.phone.dimart;

import java.util.Scanner;

public class Refferal extends User {
	private static final long serialVersionUID = 1L;
	private String cuponCode;
	private long bonus = 0;

	public Refferal() {
	}

	public Refferal(String cuponCode, long bonus) {
		this.cuponCode = cuponCode;
		this.bonus = bonus;
	}

	public Refferal(String name, int mobileNo, String emailId, String refferalCode) {
		super(name, mobileNo, emailId, refferalCode);
	}

	public String getCuponCode() {
		return cuponCode;
	}

	public void setCuponCode(String cuponCode) {
		this.cuponCode = cuponCode;
	}

	public long getBonus() {
		return bonus;
	}

	public void setBonus(long bonus) {
		this.bonus = bonus;
	}

	public void buyPhone() {
		try (Scanner sc = new Scanner(System.in)) {
			String choice;
			System.out.println("Hey " + super.getName());
			System.out.println("You have an exciting offer for the brand new phone");
			System.out.println("Do you want to buy this new amazing phone ");
			choice = sc.next();
			if (choice.equalsIgnoreCase("yes")) {
				bonus = +1000;
				System.out.println("Enter the cupon code ");
				this.cuponCode = sc.next();
				System.out.println("You have got a discount of 20%");
				String choice2;
				System.out.println("People who buy this phone also buy the Back cover with a 5% discount");
				System.out.println("Do you want to buy the cover with the phone");
				choice2 = sc.next();
				if (choice2.equalsIgnoreCase("yes")) {
					System.out.println("You have a great choice");
					bonus = +1000;
				} else {
					System.out.println("You missed the offer");
				}
				
			} else {
				System.out.println("You neglected a precious deal");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void viewBonus() {
		System.out.println("You have a bonus of : " + bonus);
	}

}
