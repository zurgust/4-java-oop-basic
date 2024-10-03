package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
// Создаем несколько точек
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(6, 8);

        // Создаем ломаную линию
        PolygonalLine line = new PolygonalLine();
        line.addPoint(p1);
        line.addPoint(p2);
        line.addPoint(p3);

        // Вывод ломаной линии
        System.out.println(line);

        // Вычисление длины ломаной линии
        System.out.println("Длина ломаной линии: " + line.getLength());
    }
}
