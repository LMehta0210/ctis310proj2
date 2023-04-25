package edu.guilford;

import java.util.Random;

public class Rational {
    //attributes
    private int numerator;
    private int denominator;
    private Random rand = new Random();

    //constructors
    public Rational() {
        //randomly generate a numerator and denominator
        numerator = rand.nextInt(201) + -100;
        denominator = 0;
        while (denominator == 0) {
            denominator = rand.nextInt(201) + -100;
        }
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

    //reduce method via Euclid's algorithm
    //CHALLENGE
    public void reduce() {
        int A = numerator;
        int B = denominator;
        while (A != 0 && B != 0) {
            int temp = B;
            B = A%B;
            A = temp;
        }
        if (A == 0) {
            System.out.println("Cannot reduce because numerator is 0");
        }
        else{
            //reduce the numerator and denominator by the GCD
            numerator = numerator/A;
            denominator = denominator/A;
        }
    }

    //add method
    public Rational add(Rational r) {
        //multiply the denominators
        int newDenominator = denominator * r.getDenominator();
        //multiply the numerators by the other denominator
        int newNumerator = numerator * r.getDenominator() + r.getNumerator() * denominator;
        //create a new Rational object with the new numerator and denominator
        Rational newRational = new Rational(newNumerator, newDenominator);
        //reduce the new Rational object
        newRational.reduce();
        //return the new Rational object
        return newRational;
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

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
