package pkg;

/**
 * Represents a SalesItem
 * 
 * @author Adam Gueits
 * @version 1.0
 * 
 */
public class SalesItem {

	private String name;
	private double cost;
	private int quantity;

	/**
	 * Creates a Sales Item with the given parameters
	 * 
	 * @param name     The name of the item
	 * @param cost     The cost of the item
	 * @param quantity The amount of the item
	 */
	public SalesItem(String name, double cost, int quantity) {

		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}

	/**
	 * Getter for Name
	 * 
	 * @return name of sales item
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for Name
	 * 
	 * @param name the name of the SalesItem
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for Cost
	 * 
	 * @return cost of SalesItem
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * Setter for Cost
	 * 
	 * @param cost the cost of the SalesItem
	 * 
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * Getter for Quantity
	 * 
	 * @return quantity of SalesItem
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Setter for Quantity
	 * 
	 * @param quantity the quantity of the SalesItem
	 * 
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Add Two SalesItem Costs together
	 * @param n SalesItem to add
	 * @return The sum of the two costs
	 */
	public double add(SalesItem n) {
		double sum = this.cost + n.cost;

		return sum;

	}

	/**
	 * Method returns all parameters of a SalesItem as a string
	 * @return SalesItem as a String
	 */
	public String toString() {
		return name + " " + Double.toString(cost) + " " + Integer.toString(quantity);
	}

}
