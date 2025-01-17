package shapes;

import constants.Color;
import constants.OutlineSize;
import constants.OutlineType;
import interfaces.Drawable;
import interfaces.Fillable;

public class Arrow extends Shape implements Fillable {
    private Color fillColor;

    public Arrow(){
        super("Arrow");
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }

    public void setFillColor(Color color){
        this.fillColor = color;
    }
}
