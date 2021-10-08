package src.com.ch2.fractionsfrogs;


public class Fraction {
    private int numerator;		//attributes
    private int denominator;

    // constructor
    public Fraction(int n, int d)	// constructor
    {
        numerator = n;
        denominator = d;
    }

    //TODO default constructor (no arguments)
    public Fraction(){
        numerator = 0;
        denominator = 1;
    }

    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }
    public Fraction add(Fraction other)
    {
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    // TODO  subtract()
    public Fraction subtract(Fraction fraction){
        int n = this.numerator * fraction.denominator - this.denominator * fraction.numerator;
        int d = this.denominator * fraction.denominator;
        return new Fraction(n, d);
    }

    // TODO multiply()
    public Fraction multiply(Fraction fraction){
        int n = this.numerator * fraction.numerator;
        int d = this.denominator * fraction.denominator;
        return new Fraction(n, d);
    }

    // TODO toString()
    public String toString(){
        return numerator + "/" + denominator;
    }

    // TODO reciprocal()
    public Fraction reciprocal(){
        return new Fraction(this.denominator, this.numerator);
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);	// create an instance of fraction
        Fraction f2 = new Fraction(4,5);

        Fraction f3 = f1.add(f2);			// add 2 fractions
        System.out.println("3/4 + 4/5 = " + f3);	// print the answer

		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);

		Fraction f5 = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + f5);

		Fraction f6 = f1.reciprocal();
        System.out.println("Reciprocal of " + f1 + " = " + f6);

		Fraction f7 = new Fraction(1, 2).add(new Fraction(3, 4));
        System.out.println(f7.toString());
    }
}

/* Output
3/4 + 4/5 = 31/20
3/4 - 4/5 = -1/20
3/4 * 4/5 = 12/20
Reciprocal of 3/4 = 4/3
10/8
 */
