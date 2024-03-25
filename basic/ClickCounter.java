package oop.basic;

/*Write a class named ClickCounter representing a simple device to keep track of how many times a button (in this case a method) is clicked.
 Internally, the class represents the number of clicks with an int value. The class provides the following methods:

public int getValue() returning the current number of clicks.
public void click() increasing the number of clicks of 1 unit.
public void undo() decreasing the number of clicks of 1 unit (but preventing negative click values).
public void reset() setting the number of clicks to 0.

 */
public class ClickCounter {
    int value;

    public ClickCounter() {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void click() {
        value = value + 1;

    }

    public void undo() {
        value = Math.max(value - 1, 0);

    }

    public void reset() {
        value = 0;
    }
}
