package oop.basic;

import java.awt.*;
import java.util.Arrays;

/**
 * Write a class named Polygon representing an irregular polygon. Internally, the class uses a Point[] for representing the vertices of the polygon.
 * The class provides the following methods:
 * <p>
 * public Polygon(Point[] vertices) creating the polygon.
 * public int getVerticesCount() returning the number of vertices.
 * public double getPerimeter() returning the perimeter of the polygon.
 * public double getArea() returning the area of the polygon.
 * public String toString().
 */
public class Polygon {
    Point[] vertices;

    public Polygon(Point[] vertices) {
        this.vertices = vertices;
    }

    public int getVerticesCount() {
        return vertices.length;
    }

    public double getPerimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;

            perimeter = perimeter + Math.hypot(vertices[i].x - vertices[next].x, vertices[i].y - vertices[next].y);

        }
        return perimeter;
    }
    public double getArea(){
        double area=0.0;
        for (int i = 0; i <vertices.length ; i++) {
            int next = (i + 1) % vertices.length;

            area = area + ((vertices[next].x * vertices[i].y) - (vertices[next].y * vertices[i].x));

        }
        return Math.abs(area/2);
    }


    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
