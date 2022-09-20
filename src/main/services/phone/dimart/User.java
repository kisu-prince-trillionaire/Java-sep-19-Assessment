package main.services.phone.dimart;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int mobileNo;
	private String emailId;
	private String refferalCode;
	private long bonus;

	public User() {
	}

	public User(String name, int mobileNo, String emailId, String refferalCode) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.refferalCode = refferalCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getRefferalCode() {
		return refferalCode;
	}

	public void setRefferalCode(String refferalCode) {
		this.refferalCode = refferalCode;
	}

	public long getBonus() {
		return bonus;
	}

	public void setBonus(long bonus) {
		this.bonus = bonus;
	}

	public void printRefferal(User userData) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter the name : ");
			userData.name = sc.nextLine();
			System.out.println("Enter the Mobile number : ");
			userData.mobileNo = sc.nextInt();
			System.out.println("Enter the Email Id : ");
			userData.emailId = sc.nextLine();
			System.out.println("Enter the refferal code : ");
			userData.refferalCode = sc.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void addRefferal(User userData) {
		String choice;
		do {
			Scanner sc = new Scanner(System.in);
			try {

//				do {
				System.out.println("Enter the name : ");
				userData.name = sc.nextLine();
				System.out.println("Enter the Mobile number : ");
				userData.mobileNo = sc.nextInt();
				System.out.println("Enter the Email Id : ");
				userData.emailId = sc.next();
				System.out.println("Enter the refferal code : ");
				userData.refferalCode = sc.next();
//					List<User> userList = new List<User>();
				File dataFile = new File("Refferal.txt");
				FileOutputStream file = new FileOutputStream(dataFile, true);
				ObjectOutputStream out = new ObjectOutputStream(file);
				User userList = (new User(userData.getName(), userData.getMobileNo(), userData.getEmailId(),
						userData.getRefferalCode()));
				out.writeObject(userList);
				out.close();
				file.close();

				System.out.println("Object has been serialized\n");
//					printRefferal(userData);
//					System.out.println("Do you want to add new refferal '_' ");
//					choice = sc.next();
//				} while (choice.equalsIgnoreCase("yes"));
			} catch (Exception e) {
				System.out.println(e);
			}
//			User userList1 = null;

			try {

				ObjectInputStream input = new ObjectInputStream(new FileInputStream("Refferal.txt"));
				User userList = (User) input.readObject();

//				System.out.println(userList.getName() + " " + userList.getMobileNo() + " " + userList.getEmailId() + " "
//						+ userList.getRefferalCode());
				System.out.println(
						userList.name + " " + userList.mobileNo + " " + userList.emailId + " " + userList.refferalCode);

				input.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Do you want to add new refferal '_' ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("yes"));
	}

	public void viewRefferalFile() throws IOException {
		String fileName = "LoginDetails.txt";
		String line = null;
		FileReader fileReader = new FileReader(fileName);
		try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
		} catch (IOException ex) {
			System.out.println("Error reading file named '" + fileName + "'");
		}

	}

	public void viewReferral() {
		System.out.println(this.name + "\t" + this.mobileNo + "\t" + this.emailId + "\t" + this.refferalCode);
	}

	public void editReferral(String name, int mobileNo, String emailId) {
		this.setName(name);
		this.setMobileNo(mobileNo);
		this.setEmailId(emailId);
		System.out.println("Data updated successfully!");
	}

	public void deleteReferral(User obj) {
		obj = null;
		System.out.println("Data successfully deleted");
	}

//		try (Scanner sc = new Scanner(System.in)) {
//
////			do {
//			System.out.println("Enter the name : ");
//			userData.name = sc.nextLine();
//			System.out.println("Enter the Mobile number : ");
//			userData.mobileNo = sc.nextInt();
//			System.out.println("Enter the Email Id : ");
//			userData.emailId = sc.next();
//			System.out.println("Enter the refferal code : ");
//			userData.refferalCode = sc.next();
////				List<User> userList = new List<User>();
//			File dataFile = new File("LoginDetails.txt");
//			FileOutputStream file = new FileOutputStream(dataFile, true);
//			ObjectOutputStream out = new ObjectOutputStream(file);
//			User userList = (new User(userData.getName(), userData.getMobileNo(), userData.getEmailId(),
//					userData.getRefferalCode()));
//			out.writeObject(userList);
//			out.close();
//			file.close();
//
//			System.out.println("Object has been serialized\n");
////				printRefferal(userData);
////				System.out.println("Do you want to add new refferal '_' ");
////				choice = sc.next();
////			} while (choice.equalsIgnoreCase("yes"));
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//		try {
//
//			ObjectInputStream input = new ObjectInputStream(new FileInputStream("LoginDetails.txt"));
//			User userList = (User) input.readObject();
//
//			System.out.println(userList.getName() + " " + userList.getMobileNo() + " " + userList.getEmailId() + " "
//					+ userList.getRefferalCode());
//
//			input.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//   }

}
