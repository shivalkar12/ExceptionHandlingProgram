package exceptioninmobilebrand;

import java.util.Scanner;

public class User {
public static void main(String[] args) {
	Scanner user= new Scanner(System.in);
	System.out.println("Enter your brand ");
	String brand =user.next();
	System.out.println("Enter your price");
	int price=user.nextInt();
	System.out.println("Enter your color");
	String color=user.next();
	try {
		Product p=new Product(brand, price, color);
		System.out.println(p);
	} catch (InvalidException e) {
		System.out.println(e.getMessage());
	}
}
}
