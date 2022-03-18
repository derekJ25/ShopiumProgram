package main;

import java.util.Scanner;

import shopiumSystem.Item;
import shopiumSystem.ShopiumSystem;

public class Menu {
	private final Scanner scanner = new Scanner(System.in);
	private final ShopiumSystem system = new ShopiumSystem();
	private boolean userChoice = true;

	public void run() {
		System.out.println("Welcome to Shopium!");

		system.addItem(new Item("Fruit", "Apple", 1000, 4.99));
		system.addItem(new Item("Fruit", "Banana", 1000, 2.99));
		system.addItem(new Item("Vegetable", "Carrot", 1000, 0.99));

		runMenu();
	}

	public void runMenu() {
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
				System.out.println("Exiting program.");
				System.exit(1);
//	ERROR DETECTION		
			default:
				System.out.println("Please select a valid option.");
			}
		}
	}

	private void searchItem() {
		System.out.println("-------------------------------------");
		System.out.println("> Searching items");
		System.out.println("-------------------------------------");
		System.out.print("Search for item: ");
		String searchKeyword = scanner.nextLine();
		system.searchItem(searchKeyword);
		if (system.getSearchedResults().size() == 0) {
			System.out.printf("%s%n", "There are no items matching your search.");
			System.out.println("-------------------------------------");
			System.out.printf("%3d) %s%n", 1, "Search another item");
			System.out.printf("%3d) %s%n", 2, "Return to menu");
			System.out.print("Please select: ");
			String option = scanner.nextLine();
			if (option.equalsIgnoreCase("1")) {
				searchItem();
			} else {
				runMenu();
			}
		} else if (system.getSearchedResults().size() == 1) {
			System.out.printf("%s%n", "There are 1 item matching your search.");
		} else {
			System.out.printf("There are %d items matching your search.%n", system.getSearchedResults().size());
		}
//	Not Completed
		
	}

	private void browseItem() {
		System.out.println("-------------------------------------");
		System.out.println("> Browsing Items");
		System.out.println("-------------------------------------");
		System.out.printf("%3d) %s%n", 1, "Browse by name");
		System.out.printf("%3d) %s%n", 2, "Browse by category");
		System.out.printf("%3d) %s%n", 3, "Browse by price");
		System.out.printf("%3d) %s%n", 4, "Browse by weight");
		System.out.printf("%3d) %s%n", 5, "Return to menu");
		System.out.println("-------------------------------------");
		System.out.print("Please select: ");
		String userInput = scanner.nextLine();
		switch(userInput) {
		case "1":
//			browseName();
		case "2":
//			browseCategory();
		case "3":
//			browsePrice();
		case "4":
//			browseWeight();
		case "5":
			runMenu();
		default:
			System.out.println("Please select a valid option.");
			browseItem();
		}
//	Not Completed		
		
	}

	private void addItemToStore() {
		System.out.println("-------------------------------------");
		System.out.println("> Add item to store");
		System.out.println("-------------------------------------");
		System.out.printf("%3d) %s%n", 1, "Add item");
		System.out.printf("%3d) %s%n", 2, "Add premade items");
		System.out.printf("%3d) %s%n", 3, "Add from file");
		System.out.printf("%3d) %s%n", 4, "Return to menu");
		String userInput = scanner.nextLine();
		switch(userInput) {
		case "1":
//			addItem();
		case "2":
//			addPremadeItem();
		case "3":
//			addFromFile();
		case "4":	
			runMenu();
		default:
			System.out.println("Pease enter a valid input.");
			addItemToStore();
		}
//	Not Completed		
		
	}

	private void checkCart() {
		System.out.println("-------------------------------------");
		System.out.println("> Viewing cart");
		System.out.println("-------------------------------------");
		if(system.getCartItems().size() == 0) {
			System.out.println("You have nothing in the cart. \nReturning to menu.");
			runMenu();
		} else {
//	Display the items in cart			
			
		}
//	Not completed		
		
	}

	private void printMenu() {
		System.out.println("-------------------------------------");
		System.out.println("> Select from main menu");
		System.out.println("-------------------------------------");
		System.out.printf("%3d) %s%n", 1, "Search item");
		System.out.printf("%3d) %s%n", 2, "Browse items");
		System.out.printf("%3d) %s%n", 3, "Add item to store");
		System.out.printf("%3d) %s%n", 4, "Cart");
		System.out.printf("%3d) %s%n", 5, "Exit");
		System.out.println("-------------------------------------");
		System.out.print("Please select: ");
	}
}
