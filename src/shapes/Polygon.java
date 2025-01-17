package shapes;

import constants.Color;
import interfaces.Fillable;

public class Polygon extends Shape implements Fillable {
    private Color fillColor;

    public Polygon(){
        super("Polygon");
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }

    public void setFillColor(Color color){
        this.fillColor = color;
    }
}
