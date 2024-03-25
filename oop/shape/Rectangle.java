package oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape {
    Point bottomRight;
    Point upperLeft;

    public Rectangle(String color, String id, Point bottomRight, Point upperLeft) {
        super(color, id);
        this.bottomRight = bottomRight;
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    @Override
    public double getArea() {
        double area = (bottomRight.x - upperLeft.x) * (bottomRight.y - upperLeft.y);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = ((bottomRight.x - upperLeft.x) + (bottomRight.y - upperLeft.y) * 2);
        return perimeter;
    }

    @Override
    public void move(Point movement) {
        upperLeft.translate(movement.x, movement.y);
        bottomRight.translate(movement.x, movement.y);
    }

    @Override
    public void resize(double scale) {
        bottomRight.x = (int) (upperLeft.x + ((bottomRight.x - upperLeft.x) * scale));
        bottomRight.y = (int) (upperLeft.y - ((upperLeft.y - bottomRight.y) * scale));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "bottomRight=" + bottomRight +
                ", upperLeft=" + upperLeft +
                ", color='" + color + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
