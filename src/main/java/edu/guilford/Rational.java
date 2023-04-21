package edu.guilford;

public class Rational {
    //attributes
    private int numerator;
    private int denominator;

    //constructors
    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int n, int d) {
        numerator = n;
        denominator = d;
        //throw warning if denominator is 0
        if (denominator == 0) {
            System.out.println("Warning: denominator is 0");
        }
    }

    //METHODS
    public void invert() {
        //swap numerator and denominator
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    //toDouble
    public double toDouble() {
        return (double) numerator / denominator;
    }

    //should have void return because it just maniupulates the private attributes,
    //returning the numerator is not pertinent to the task
    public void negate() {
        numerator = -numerator;
    }

    //getters and setters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int n) {
        numerator = n;
    }

    public void setDenominator(int d) {
        denominator = d;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
