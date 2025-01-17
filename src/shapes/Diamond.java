package shapes;

import constants.Color;
import interfaces.Fillable;

public class Diamond extends Shape implements Fillable {
    private Color fillColor;

    public Diamond(){
        super("Diamond");
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }

    public void setFillColor(Color color){
        this.fillColor = color;
    }
}
