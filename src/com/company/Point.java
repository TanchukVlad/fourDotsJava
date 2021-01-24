package com.company;

public class Point {

    private String name;
    private float x;
    private float y;

    public Point(String name) {
        this.name = name;
    }

    public Point(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return this.name + ":(" +this.x + this.y + ")";
    }
}
