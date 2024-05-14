package array;

import java.util.Scanner;

public class Java作业4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double real1, image1;
        double real2, image2;

        real1 = sc.nextDouble();
        image1 = sc.nextDouble();
        real2 = sc.nextDouble();
        image2 = sc.nextDouble();

        Complex c1 = new Complex(real1, image1);
        Complex c2 = new Complex(real2, image2);
        Complex c = new Complex();

        c = c.complexAdd(c.complexMul(c1, c2), c.complexDiv(c2, c1));

        System.out.println(c);

    }
}

class Complex {
    private double realPart;
    private double imaginaryPart;

    //加法
    public Complex complexAdd(Complex c1, Complex c2) {
        double real = c1.getRealPart() + c2.getRealPart();
        double image = c1.getImaginaryPart() + c2.getImaginaryPart();
        return new Complex(real, image);
    }

    //减法
    public Complex complexMinus(Complex c1, Complex c2) {
        double real = c1.getRealPart() - c2.getRealPart();
        double image = c1.getImaginaryPart() - c2.getImaginaryPart();
        return new Complex(real, image);
    }

    //乘法
    public Complex complexMul(Complex c1, Complex c2) {
        double real = c1.getRealPart() * c2.getRealPart() - c1.getImaginaryPart() * c2.getImaginaryPart();
        double image = c1.getRealPart() * c2.getImaginaryPart() + c1.getImaginaryPart() * c2.getRealPart();
        return new Complex(real, image);
    }

    //除法
    public Complex complexDiv(Complex c1, Complex c2) {
        double denominator = c2.getRealPart() * c2.getRealPart() + c2.getImaginaryPart() * c2.getImaginaryPart();
        double real = (c1.getRealPart() * c2.getRealPart() + c1.getImaginaryPart() * c2.getImaginaryPart()) / denominator;
        double image = (c1.getImaginaryPart() * c2.getRealPart() - c1.getRealPart() * c2.getImaginaryPart()) / denominator;
        return new Complex(real, image);
    }

    public Complex() {
    }
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }
    public double getImaginaryPart() {
        return imaginaryPart;
    }
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        if (imaginaryPart == 0.0 & realPart == 0.0)
            return realPart + "";
        if (realPart == 0.0)
            return imaginaryPart + "i";
        if (imaginaryPart == 0.0)
            return realPart + "";
        if (imaginaryPart < 0.0)
            return realPart + "" + imaginaryPart + "i";
        else
            return realPart + "+" + imaginaryPart + "i";
    }
}
