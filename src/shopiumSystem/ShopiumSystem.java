package shopiumSystem;

import java.util.ArrayList;

public class ShopiumSystem {
	private ArrayList<Item> items;
	
	public ShopiumSystem() {
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public ArrayList<Item> getItems(){
		return items;
	}
	
}
