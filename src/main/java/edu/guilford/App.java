package edu.guilford;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //create a new Rational object
        Rational r1 = new Rational();
        //print the object
        System.out.println("r1: " + r1);
        //create a new Rational object with parameters
        Rational r2 = new Rational(3, 4);
        //print the object
        System.out.println("r2: " + r2);
        
        //tests negate method
        System.out.println("\nTest negate method");
        System.out.println("Input 3/4, Expected output -3/4");
        System.out.print("Negated " + r2 + ": ");
        r2.negate();
        System.out.println(r2);
        r2.negate();

        //test invert method
        System.out.println("\nTest invert method");
        System.out.println("Input 3/4, Expected output 4/3");
        System.out.print("Inverted  q" + r2 + ": ");
        r2.invert();
        System.out.println(r2);
        r2.invert();

        //test toDouble method
        System.out.println("\nTest toDouble method");
        System.out.println("Input 3/4, Expected output .75");
        System.out.println("Double " + r2 + ": " + r2.toDouble());

        //test reduce method
        System.out.println("\nTest reduce method");
        Rational r3 = new Rational(12, 18);
        System.out.println("Input 12/18, Expected output 2/3");
        System.out.print("Reduced " + r3 + ": ");
        r3.reduce();
        System.out.println(r3);

        //test add method
        System.out.println("\nTest add method");
        System.out.println("Input 3/4 and 2/3, Expected output 17/12");
        System.out.println(r2 + " + " + r3 + " = " + r2.add(r3));
    }
}
