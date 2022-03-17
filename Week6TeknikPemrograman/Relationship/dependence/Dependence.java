/**
*
* @author Annisa
* @since 17/03/2022
*/

package relationship.dependence;

class Dependence {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        Drawing drawing = new Drawing();
        drawing.setShape((triangle));
        drawing.drawShape();

        drawing.setShape(rectangle);
        drawing.drawShape();
    }
}
