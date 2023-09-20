public class TestVector {
    public static void main(String[] args) {
        Vector v = new Vector(2);

        v.setRational(0, 0, 1);
        v.setRational(1, 0, 1);

        Rational a = new Rational(2, 3);
        v.setRational(0, a);
        System.out.print(v.toString() + "\n");

        Rational b = new Rational(3, 2);

        a.mult(b);

        System.out.print(v.toString() + "\n");



        v.setRational(0, 1, 2);
        v.setRational(1, 1, 2);
        System.out.print(v.toString() + "\n");

        a = new Rational(v.get(0));
        System.out.print(a.toString() + "\n");
        a.mult(b);
        System.out.print(a.toString() + "\n");

        System.out.print(v.toString() + "\n");

        ExtensibleVector ext_v = new ExtensibleVector(v.getDimension());

        ext_v.setRational(0, 0, 1);
        ext_v.setRational(1, 0, 1);
        

        ext_v.append(b);
        System.out.print(v.toString() + "\n");
        System.out.print(ext_v.toString() + "\n");
    }


}
