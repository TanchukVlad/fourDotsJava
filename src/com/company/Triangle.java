package com.company;


public class Triangle {

    private Point point1;
    private Point point2;
    private Point point3;
    private double side1;
    private double side2;
    private double side3;
    private double area;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.side1 = calcSideByPoints(this.point1, this.point2);
        this.side2 = calcSideByPoints(this.point2, this.point3);
        this.side3 = calcSideByPoints(this.point3, this.point1);
        this.area = calcArea(this.side1, this.side2, this.side3);
    }

    @Override
    public String toString() {
        return point1.getName() + point2.getName() + point3.getName();
    }

    public double getArea() {
        return area;
    }

    /**
     * Calc length of side.
     * @param p1 point 1
     * @param p2 point 2
     * @return calculated length of side
     */
    private double calcSideByPoints(Point p1, Point p2) {

        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    /**
     * Calc area of the triangle with known three sides.
     * @param s1 the first side
     * @param s2 the second side
     * @param s3 the third side
     * @return calculated area
     */
    private double calcArea(double s1, double s2, double s3) {
        double p = (s1 + s2 + s3) * 0.5;
        return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
    }

    /**
     * Checks, is the point outside or in the triangle.
     * @param p point to be checked
     * @return {@code true} if the point is inside of triangle
     */
    public boolean isInside(Point p) {

        Triangle addTr1 = new Triangle(this.point1, this.point2, p);
        Triangle addTr2 = new Triangle(this.point1, p, this.point3);
        Triangle addTr3 = new Triangle(p, this.point2, this.point3);

        double sumOfAddTr = addTr1.area + addTr2.area + addTr3.area;
        double diff = this.area - sumOfAddTr;

        return -1e-4 <= diff && diff <= 1e-4;
    }
}
