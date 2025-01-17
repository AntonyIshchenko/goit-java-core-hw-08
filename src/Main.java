import shapes.*;
import utils.Output;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();
        Shape arrow = new Arrow();
        Shape diamond = new Diamond();
        Shape line = new Line();
        Shape oval = new Oval();
        Shape polygon = new Polygon();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        Output.printName(arrow);
        Output.printName(diamond);
        Output.printName(line);
        Output.printName(oval);
        Output.printName(polygon);
        Output.printName(rectangle);
        Output.printName(triangle);
    }
}
