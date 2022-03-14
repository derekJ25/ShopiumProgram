package main;

import java.util.Scanner;

public class Menu {
	private final Scanner scanner = new Scanner(System.in);
	private boolean userChoice = true;
	
	public void run(){
		System.out.println("Welcome to Shopium!");
		
		while (userChoice) {
			printMenu();
			String option = scanner.nextLine();

			switch (option) {
			case "1":
				searchItem();
				userChoice = false;
				break;
			case "2":
				browseItem();
				userChoice = false;
				break;
			case "3":
				addItemToStore();
				userChoice = false;
				break;
			case "4":
				checkCart();
				userChoice = false;
				break;
			case "5":
				System.exit(1);
			default:
				System.out.println("Please select a valid option.");
			}
		}
	}
	
	private void searchItem() {
		System.out.println("Search item.");
	}
	
	private void browseItem() {
		System.out.println("Browse item.");
	}
	
	private void addItemToStore() {
		System.out.println("Add item to store.");
	}
	
	private void checkCart() {
		System.out.println("Viewing cart.");
	}
	
	private void printMenu() {
		System.out.println("-------------------------------------");
		System.out.println("> Select from main menu");
		System.out.println("-------------------------------------");
		System.out.printf("%3d) %s%n", 1, "Search item");
		System.out.printf("%3d) %s%n", 2, "Browse Items");
		System.out.printf("%3d) %s%n", 3, "Add item to store");
		System.out.printf("%3d) %s%n", 4, "Cart");
		System.out.printf("%3d) %s%n", 5, "Exit");
		System.out.println("-------------------------------------");
		System.out.print("Please select: ");
	}
}
