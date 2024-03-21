package oop.basic.basic;


public class Letter {

    String from;
    String to;
    StringBuilder lines;

    /**
     * the constructor, supply the names of the sender and the recipient
     */
    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        this.lines = new StringBuilder();
    }

    /**
     * Supply a method to add a line of text to the body of the letter.
     */
    public void addLine(String line) {
        lines.append(line).append('\n');
    }


    /**
     * Supply a method that returns the entire text of the letter knowing the form
     */
    public String getText() {
        return "Dear " + to + ":" + "\n\n" + lines + "\n" + "Sincerely,\n\n" + from;
    }

}
