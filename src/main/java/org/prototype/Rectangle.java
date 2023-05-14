package org.prototype;

public class Rectangle implements Cloneable {
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getWidth() {
        return x;
    }

    public int getHeight() {
        return y;
    }

    public void setWidth(int width) {
        this.x = width;
    }

    public void setHeight(int height) {
        this.y = height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(x, y);
    }
}
