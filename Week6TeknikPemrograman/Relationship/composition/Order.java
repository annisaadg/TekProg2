/**
*
* @author Annisa
* @since 17/03/2022
*/

package relationship.composition;

import java.util.ArrayList;
import java.util.List;

class Order {
	private int id;
	private String name;
	private List<LineItem> lineItems;

	public Order(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.lineItems = new ArrayList<LineItem>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return ">> Order id= " + id + "\n   Order name= " + name + "\n   >> Line Items:\n\t" + lineItems + "";
	}
	
	// Add line item to order
	public void addItem(int id, int quantity, Product p) {
		this.lineItems.add(new LineItem(id, quantity, p));
	}
}
