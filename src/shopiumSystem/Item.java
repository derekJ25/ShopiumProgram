package shopiumSystem;

public class Item {
	private String category;
	private String name;
	private double weight;
	private double cost;
	
	public Item(String category, String name, double weight, double cost) {
		this.category = category;
		this.name = name;
		this.weight = weight;
		this.cost = cost;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getCost() {
		return cost;
	}
}
