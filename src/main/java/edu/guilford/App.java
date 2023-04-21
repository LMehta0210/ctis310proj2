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
        r2.negate();
        System.out.println("Negated r2: " + r2);
        r2.negate();

        //test invert method
        r2.invert();
        System.out.println("Inverted r2: " + r2);
        r2.invert();

        //test toDouble method
        System.out.println("Double r2: " + r2.toDouble());

        //test reduce method
        Rational r3 = new Rational(12, 18);
        System.out.println("r3: " + r3);
        r3.reduce();
        System.out.println("Reduced r3: " + r3);

        //test add method
        System.out.println(r2 + " + " + r3 + " = " + r2.add(r3));
    }
}
