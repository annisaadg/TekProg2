/**
 *
 * @author Annisa Dinda
 * @since 17/02/2022
 */

package relationship.aggregation;

public class Aggregation {
    public static void main(String[] args) {
        // Create Products
        Product p1 = new Product(1, "Stethoscope", "This is stethoscope");
        Product p2 = new Product(2, "Surgical Mask", "This is surgical mask");
        Product p3 = new Product(3, "Bandage", "This is bandage");
    
        // Create LineItem and add quantity of the products
        LineItem item1 = new LineItem(1, 2, p1);
        LineItem item2 = new LineItem(1, 2, p2);
        LineItem item3 = new LineItem(1, 2, p3);

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
    }
}
