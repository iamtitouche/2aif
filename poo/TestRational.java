public class TestRational {
    public static void main(String[] args) {
        Rational number;

        number = new Rational();

        number.setNum(3);

        System.out.print("Numérateur " + number.getNum() + "\n");
        System.out.print("Dénominateur " + number.getDen() + "\n");

        System.out.print(number.toString() + "\n");

        number.setDen(0);

        Rational nb2 = new Rational();
        nb2.setNum(2);
        nb2.setDen(3);

        number.mult(nb2);
        System.out.print(number.toString() + "\n");

        number.mult(number);
        System.out.print(number.toString() + "\n");

        number.reduce();
        System.out.print(number.toString() + "\n");


        Rational c = new Rational();
        c = Rational.mult_2(number, nb2);
        System.out.print(c.toString() + "\n");
    }
}