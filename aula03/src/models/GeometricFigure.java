package models;

import interfaces.IShow;

public abstract class GeometricFigure {
    private int x, y;
    public IShow iShow;

    public GeometricFigure(IShow iShow) {
        this.iShow = iShow;
    }

    public abstract void position();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
