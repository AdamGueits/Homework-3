package pkg;

import java.util.ArrayList;

/**
 * Represents a SalesSlip
 * 
 * @author Adam Gueits
 * @version 1.0
 */

public class SalesSlip {
	private ArrayList<SalesItem> list;

	/**
	 * Constructor for A Sales Slip
	 */
	public SalesSlip() {
		list = new ArrayList<>();
	}

	/**
	 * Add a Sales Item to the SalesSlip
	 * 
	 * @param entry A single sales item
	 * 
	 */

	public void add(SalesItem entry) {
		list.add(entry);

	}

	/**
	 * Converts a SalesSlip to a String
	 * 
	 * @return the list as a string
	 */
	public String toString() {
		String output = list.toString().replaceAll("[(){}<>\\[\\]]", "");
		return output;
	}

	/**
	 * Compute the total sales
	 * 
	 * @return Total Sales of the items in the list
	 */
	public double totalSales() {
		double total = 0.0;
		for (SalesItem list : this.list) {
			total += list.getCost();
		}

		return total;

	}

}
