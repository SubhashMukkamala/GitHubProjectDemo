package packagesJava;

import java.util.Scanner;

public class BuiltInPackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Username:");
		
//		ctrl+Shift+O
		
		String userName = myObj.nextLine();
		System.out.println("Username entered is - " + userName);
		
	}

}