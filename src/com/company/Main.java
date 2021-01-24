package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Point> pointsList = new ArrayList<>();

        createPoints(pointsList, 4);

        for (Point p : pointsList) {
            enterPointXY(p);
        }

        printRes(pointsList, 0, 1, 2, 3);
        printRes(pointsList, 1, 2, 3, 0);
        printRes(pointsList, 2, 3, 0, 1);
        printRes(pointsList, 3, 0, 1, 2);

    }

    /**
     * Creates a list of Points.
     * @param pList List of points to be printed
     * @param numOfPoint number of points
     */
    static void createPoints(List<Point> pList, int numOfPoint) {
        for (int i = 0; i < numOfPoint; i++) {
            System.out.print("Enter point name: ");
            String nameOfPoint = scanner.nextLine();
            pList.add(new Point(nameOfPoint));
        }
    }

    /**
     * Sets x and y coordinates in the Point.
     * @param p point for coordinates x and y to be set
     */
    static void enterPointXY(Point p) {
        System.out.print(p.getName() + ":\tx = ");
        float x = scanner.nextFloat();
        System.out.print("\ty = ");
        float y = scanner.nextFloat();

        p.setX(x);
        p.setY(y);
    }

    /**
     * Prints whether the point inside triangle.
     * @param pl List of points to be printed
     * @param n0 num of the first point of the triangle
     * @param n1 num of the second point of the triangle
     * @param n2 num of the third point of the triangle
     * @param n3 num of the point to be checked
     */
    static void printRes(List<Point> pl, int n0, int n1, int n2, int n3) {
        Triangle tr1 = new Triangle(pl.get(n0), pl.get(n1), pl.get(n2));
        if (tr1.isInside(pl.get(n3))) {
            System.out.println(pl.get(n3) + " is inside " + tr1);
        } else {
            System.out.println(pl.get(n3) + " is outside " + tr1);
        }
    }
}


