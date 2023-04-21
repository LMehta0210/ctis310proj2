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
        System.out.println(r1);
        //create a new Rational object with parameters
        Rational r2 = new Rational(3, 4);
        //print the object
        System.out.println(r2);
        
        //tests negate method
        r2.negate();
        System.out.println("Negated r2: " + r2);

        //test invert method
        r2.invert();
        System.out.println("Inverted and negated r2: " + r2);

        //test toDouble method
        System.out.println("Double r2: " + r2.toDouble());

        
    }
}
