
public class fraction {

    public static Fraction add(Fraction f1, Fraction f2) {
        int Numerator = f1.num * f2.den + f2.num * f1.den;
        int denominator = f1.den * f2.den;
        return new Fraction(Numerator, denominator);
    }

    public static Fraction substract(Fraction f1, Fraction f2) {
        int Numerator = f1.num * f2.den - f2.num * f1.den;
        int denominator = f1.den * f2.den;
        return new Fraction(Numerator, denominator);
    }

    public static Fraction multiply(Fraction f1, Fraction f2) {
        int Numerator = f1.num * f2.num;
        int denominator = f1.den * f2.den;
        return new Fraction(Numerator, denominator);
    }

    public static Fraction division(Fraction f1, Fraction f2) {
        int Numerator = f1.num * f2.den;
        int denominator = f1.den * f2.num;
        return new Fraction(Numerator, denominator);
    }

    // euclid devision algorith dividant = divisor*quesiont + remainder;
    // where, 0 <= r < divisor;
    // max = (min*(max/min)) + max % min; if r==0 then HCF is min(the last divisor);
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        else {
            return gcd(b % a, a);
        }
    }

    public static class Fraction {
        int num;
        int den;

        Fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simplify();
        }

        public void simplify() {
            boolean isNegative = (num * den < 0) ? true : false;
            num = Math.abs(num);
            den = Math.abs(den);
            int hcf = gcd(num, den);
            this.num /= hcf;
            this.den /= hcf;
            if (isNegative)
                num = -num;
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, -7);
        System.out.println("Fraction 1 : " + f1.num + "/" + f1.den);
        Fraction f2 = new Fraction(7, 3);
        System.out.println("Fraction 2 : " + f2.num + "/" + f2.den);
        Fraction f3 = add(f1, f2);
        System.out.println("Addition : " + f3.num + "/" + f3.den);
        Fraction f4 = substract(f1, f2);
        System.out.println("Substraction : " + f4.num + "/" + f4.den);
        Fraction f5 = multiply(f1, f2);
        System.out.println("Multiplication : " + f5.num + "/" + f5.den);
        Fraction f6 = division(f1, f2);
        System.out.println("Division : " + f6.num + "/" + f6.den);

    }
}
