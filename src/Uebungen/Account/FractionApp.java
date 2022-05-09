package Uebungen.Account;

public class FractionApp {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(2, 4);
        Fraction fr2 = new Fraction(2, 8);

        fr1.print();
        System.out.println(Fraction.getNrFractions());

    }
}
