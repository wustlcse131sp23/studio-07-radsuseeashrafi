package studio7;

public class fraction {
	private int numerator;
	private int denominator;
	
	public fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	
	public fraction sum(fraction other) {
		int numerator = this.numerator*other.denominator+other.numerator*this.denominator;
		int denominator = this.denominator*other.denominator;
		fraction bruh = new fraction(numerator, denominator);
		return bruh;
	}
	public fraction multiply(fraction other) {
		int numerator = this.numerator*other.numerator;
		int denominator = this.denominator*other.denominator;
		fraction bruh = new fraction(numerator, denominator);
		return bruh;
	}
	public fraction reciprocal() {
		int numerator = this.denominator;
		int denominator = this.numerator;
		fraction bruh = new fraction(numerator, denominator);
		return bruh;
	}
	
	public fraction simplify() {
		
	}

	public static void main(String[] args) {
		fraction bro = new fraction(1,4);
		fraction dawg = new fraction(3,4);
		fraction hi = bro.reciprocal();
		System.out.println(hi.toString());
		
	}

}
