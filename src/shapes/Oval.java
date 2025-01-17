package shapes;

import constants.Color;
import interfaces.Fillable;

public class Oval extends Shape implements Fillable {
    private Color fillColor;

    public Oval(){
        super("Oval");
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }

    public void setFillColor(Color color){
        this.fillColor = color;
    }
}
