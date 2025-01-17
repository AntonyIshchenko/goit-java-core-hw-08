package interfaces;

import constants.Color;
import constants.OutlineSize;
import constants.OutlineType;

public interface Drawable {
    Color getOutlineColor();
    void setOutlineColor(Color color);
    OutlineType getOutlineType();
    void setOutlineType(OutlineType type);
    OutlineSize getOutlineSize();
    void setOutlineSize(OutlineSize size);
    float[] getCoordinates();
}
