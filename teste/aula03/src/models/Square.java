package models;

import interfaces.IShow;

public class Square extends GeometricFigure{

    public Square(IShow iShow) {
        super(iShow);
    }

    @Override
    public void position() {
        iShow.show("Square: " + getX() + ", " + getY());
    }
}
