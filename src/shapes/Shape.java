package shapes;

import constants.Color;
import constants.OutlineSize;
import constants.OutlineType;
import interfaces.Drawable;

public class Shape implements Drawable {
    protected String name;
    protected Color outlineColor;
    protected OutlineType outlineType;
    protected OutlineSize outlineSize;

    public Shape() {
        this.name = "Unknown figure";
    }

    public Shape(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public  Color getOutlineColor(){
        return this.outlineColor;
    }

    @Override
    public void setOutlineColor(Color color){
        this.outlineColor = color;
    }

    @Override
    public  OutlineType getOutlineType() {
        return this.outlineType;
    }

    @Override
    public void setOutlineType(OutlineType type){
        this.outlineType = type;
    }

    @Override
    public OutlineSize getOutlineSize() {
        return this.outlineSize;
    }

    @Override
    public void setOutlineSize(OutlineSize size) {
        this.outlineSize = size;
    }

    @Override
    public float[] getCoordinates() {
        return new float[] {};
    }
}
