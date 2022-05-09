package Uebungen.Account;

public class Fraction {
    //Write a class that represents a fraction. A fraction consists of
    //an integer numerator and an integer denominator.
    //(denominator).
    private static int nrFractions = 0;
    private int numerator;
    private int denominator;

    //The constructor takes the values for denominator and numerator.
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        ++nrFractions; //nrFractions = nrFractions + 1; //nrFractions += 1;
    }
    //The values for denominator and numerator are to be returned via get methods

    public static int getNrFractions(){
        return nrFractions;
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Write a method double toDecimal(), which returns the fraction as decimal number

     public double toDecimal(){
        return (double)numerator/denominator;
     }
     //Write a method void print(), which prints the fraction as follows
    //Ex: 5 / 7

    public void print(){
        System.out.println(numerator + " / " + denominator);
    }
    //Write a method public Fraction multiplicate(Fraction b2), which multiplies fraction b2
    //by its own values and returns a new fraction as result

    public Fraction multiplicate(Fraction b2)
    {
        Fraction erg = new Fraction(numerator, denominator);

        erg.numerator = erg.numerator * b2.numerator;
        erg.denominator = erg.denominator * b2.denominator;

        return erg;

    }
}
