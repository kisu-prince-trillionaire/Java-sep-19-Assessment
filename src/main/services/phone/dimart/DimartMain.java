package main.services.phone.dimart;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class DimartMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----#######---------- Dimart Phone -------#######--------");

//		System.out.println("Do you have an existeing account");
//		String choice = sc.nextLine();
//		if (choice.equalsIgnoreCase("yes")) {
//			Login loginData = new Login();
//			System.out.println("Login process of the customer needed ");
//			loginData.login();
//		} else {
//			Registration registrationData = new Registration();
//			System.out.println("Registration of the Customer started ");
//			registrationData.register();
//
//			Login loginData = new Login();
//			System.out.println("Login process of the customer needed ");
//			loginData.login();
//		}

		User userList = new User();
		userList.addRefferal(userList);
		
		Refferal refferalData = new Refferal();
		refferalData.buyPhone();
		refferalData.viewBonus();
		
//		String choice;
//		String filename = "Refferal.txt";
//		try {
//			
//
//				FileOutputStream file = new FileOutputStream(filename);
//				ObjectOutputStream out = new ObjectOutputStream(file);
//				out.writeObject(userList);
//				out.close();
//				file.close();
//
//				System.out.println("Object has been serialized\n" + "Data before Deserialization.");
//				userList.printRefferal(userList);
//				
//		
//			
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//		userList = null;
//
//		// Deserialization
//		try {
//
//	
//			FileInputStream file = new FileInputStream(filename);
//			ObjectInputStream in = new ObjectInputStream(file);
//
//			
//			userList = (User) in.readObject();
//
//			in.close();
//			file.close();
//			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
//			userList.printRefferal(userList);
//
//			
//		}
//
//		catch (IOException ex) {
//			System.out.println("IOException is caught");
//		}
//
//		catch (ClassNotFoundException ex) {
//			System.out.println("ClassNotFoundException" + " is caught");
//		}
		sc.close();
	}

}
