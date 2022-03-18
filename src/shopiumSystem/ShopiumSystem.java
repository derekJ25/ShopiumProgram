package shopiumSystem;

import java.util.ArrayList;

public class ShopiumSystem {
	private ArrayList<Item> items;
	private ArrayList<Item> searchedResults;
	private ArrayList<Item> cartItems;
	private int searchedAmount;
	
	public ShopiumSystem() {
		items = new ArrayList<Item>();
		searchedResults = new ArrayList<Item>();
		cartItems = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void addSearchedItem(Item item) {
		searchedResults.add(item);
	}
	
	public void addCartItem(Item item) {
		cartItems.add(item);
	}
	
	public void searchItem(String itemName) {
		int number = 1;
		for(int i = 0; i < items.size(); i++) {
			if(items.get(i).getName().toLowerCase().contains(itemName.toLowerCase())) {
				System.out.printf("%3d) %s%n", number, items.get(i).getName());
				addSearchedItem(items.get(i));
				number++;
			}
		}
		searchedAmount = number;
		System.out.printf("%3d) %s%n", number, "Go to main menu");
	}
	
	public ArrayList<Item> getItems(){
		return items;
	}
	
	public ArrayList<Item> getSearchedResults(){
		return searchedResults;
	}
	
	public ArrayList<Item> getCartItems(){
		return cartItems;
	}
	
}
