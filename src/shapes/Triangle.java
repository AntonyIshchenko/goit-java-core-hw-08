package shapes;

import constants.Color;
import interfaces.Fillable;

public class Triangle extends Shape implements Fillable {
    private Color fillColor;

    public Triangle(){
        super("Triangle");
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }

    public void setFillColor(Color color){
        this.fillColor = color;
    }
}

