package models;
import models.GeometricFigure;
import interfaces.IShow;

public class Circle extends GeometricFigure {

    public Circle(IShow ishow) {
        super(ishow);
    }

    @Override
    public void position() {
        iShow.show("Circle: " + getX() + ", " + getY());
    }
}
