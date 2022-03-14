package main;

public class Menu {
	
	public void run(){
		System.out.println("Welcome to Shopium!");
		runMenu();
	}
	
	private void runMenu() {
		System.out.println("-------------------------------------");
		System.out.println("> Select from main menu");
		System.out.println("-------------------------------------");
		System.out.printf("%3d) %s%n", 1, "Search item");
		System.out.printf("%3d) %s%n", 2, "Add item");
		System.out.printf("%3d) %s%n", 3, "Browse Items");
		System.out.printf("%3d) %s%n", 4, "Checklist");
		System.out.printf("%3d) %s%n", 5, "Cart");
		System.out.printf("%3d) %s%n", 6, "Exit");
		System.out.println("-------------------------------------");
	}
}
