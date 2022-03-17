/**
*
* @author Annisa
* @since 17/03/2022
*/

package relationship.dependence;

public class Drawing {
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void drawShape() {
        this.shape.drawShape();
    }
}
