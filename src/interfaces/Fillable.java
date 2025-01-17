package interfaces;

import constants.Color;

public interface Fillable extends Drawable{
    Color getFillColor();
    void setFillColor(Color color);
}
