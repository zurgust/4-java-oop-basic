package com.example.task05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private final List<Point> points = new ArrayList<>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points.clear();
        for (Point point : points) {
            // Копируем каждую точку, чтобы предотвратить влияние внешних изменений
            this.points.add(new Point(point.getX(), point.getY()));
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        // Копируем объект точки перед добавлением
        this.points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double totalLength = 0.0;
        for (int i = 1; i < points.size(); i++) {
            totalLength += points.get(i - 1).getLength(points.get(i));
        }
        return totalLength;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PolygonalLine: ");
        for (Point point : points) {
            sb.append(point.toString()).append(" -> ");
        }
        if (!points.isEmpty()) {
            sb.setLength(sb.length() - 4);  // Удаляем последний "->"
        }
        return sb.toString();
    }

}
