package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
    ComplexNum a = new ComplexNum(3, 2);
    ComplexNum b = new ComplexNum(1, 7);
    ComplexNum c = ComplexNum.add(a, b);
    System.out.println("Sum:\n" + a + " + " + b + " = " + c);
    c = ComplexNum.multiply(a, b);
    System.out.println("Multiply:\n(" + a + ") * (" + b + ") = " + c);
    }
}
