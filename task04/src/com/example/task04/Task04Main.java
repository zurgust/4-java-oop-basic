package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(2, 2);

        Line line = new Line(p1, p2);

        boolean isCollinear = line.isCollinearLine(p3);

        System.out.println(line);
        System.out.println("Точка " + p3 + " лежит на линии: " + isCollinear);
    }
}
