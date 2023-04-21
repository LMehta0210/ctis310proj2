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

    //methods
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
