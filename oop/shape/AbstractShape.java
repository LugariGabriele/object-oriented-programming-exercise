package oop.shape;

import java.awt.*;

public abstract class AbstractShape implements Computable, Movable, Resizable {
String color;
String id;

    public AbstractShape(String color, String id) {
        this.id = id;
        setColor(color);
    }



    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }

    public void setColor(String color) {
        if (!color.matches("^#[0-9a-fA-F]{6}")) {
            throw new IllegalArgumentException("Invalid RGB Color (#RRGGBB)");
        }
        this.color = color;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract void move(Point movement);

    public abstract void resize(double scale);
}
