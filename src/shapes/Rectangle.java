package shapes;

import constants.Color;
import interfaces.Fillable;

public class Rectangle extends Shape implements Fillable {
    private Color fillColor;

    public Rectangle(){
        super("Rectangle");
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }

    public void setFillColor(Color color){
        this.fillColor = color;
    }
}
