public class TestRationnal {
    public static void main(String[] args) {
        Rationnal number;

        number = new Rationnal();

        number.setNum(3);

        System.out.print("Numérateur " + number.getNum() + "\n");
        System.out.print("Dénominateur " + number.getDen() + "\n");

        System.out.print(number.toString() + "\n");

        number.setDen(0);

        Rationnal nb2 = new Rationnal();
        nb2.setNum(2);
        nb2.setDen(3);

        number.mult(nb2);
        System.out.print(number.toString() + "\n");

        number.mult(number);
        System.out.print(number.toString() + "\n");

        number.reduce();
        System.out.print(number.toString() + "\n");


        Rationnal c = new Rationnal();
        c = Rationnal.mult_2(number, nb2);
        System.out.print(c.toString() + "\n");
    }
}