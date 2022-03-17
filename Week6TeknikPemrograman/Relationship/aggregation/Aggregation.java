/**
*
* @author Annisa
* @since 17/03/2022
*/

package relationship.aggregation;

public class Aggregation {
    public static void main(String[] args) {
        // Create Products
        Product p1 = new Product(1, "Pen", "This is red pen");
        Product p2 = new Product(2, "Pencil", "This is pencil");
        Product p3 = new Product(3, "ColorBox", "This is color box");
    
        // Create LineItem and add quantity of the products
        LineItem item1 = new LineItem(1, 2, p1);
        LineItem item2 = new LineItem(1, 2, p2);
        LineItem item3 = new LineItem(1, 2, p3);

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
    }
}
