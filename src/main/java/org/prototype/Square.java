package org.prototype;

public class Square implements Cloneable {
    private int x;

    public Square(int x) {
        this.x = x;
    }

    public int getSide() {
        return x;
    }

    public void setSide(int x) {
        this.x = x;
    }

    @Override
    public Square clone() {
        return new Square(this.x);
    }
}
