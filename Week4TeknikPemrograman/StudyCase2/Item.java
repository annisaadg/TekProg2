package SC2;

/**
 *
 * @author Annisa
 * @since 24/02/2022
 * @version 1.0
 */
public class Item {
    private String name;
    private Item() {
        name = "Ipin";
    }
    
    public Item(String name) {
       this();
       System.out.println(this.name);
    }
}
