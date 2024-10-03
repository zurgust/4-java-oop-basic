package com.example.task03;

public class ComplexNum {
    private double real;
    private double imag;

    public ComplexNum(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImag() {
        return imag;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }

    public static ComplexNum add(ComplexNum a, ComplexNum b) {
        double newReal = a.real + b.real;
        double newImag = a.imag + b.imag;
        return new ComplexNum(newReal, newImag);
    }

    public static ComplexNum multiply(ComplexNum a, ComplexNum b) {
        double newReal = (a.real * b.real) - (a.imag * b.imag);
        double newImag = (a.real * b.imag) + (a.imag * b.real);
        return new ComplexNum(newReal, newImag);
    }

    public String toString() {
        return String.format("%.1f + %.1fi", real, imag);
    }



}
