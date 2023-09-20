public class TestVector {
    public static void main(String[] args) {
        Vector v = new Vector(2);

        v.setRationnal(0, 0, 1);
        v.setRationnal(1, 0, 1);

        Rationnal a = new Rationnal(2, 3);
        v.setRationnal(0, a);
        System.out.print(v.toString() + "\n");

        Rationnal b = new Rationnal(3, 2);

        a.mult(b);

        System.out.print(v.toString() + "\n");



        v.setRationnal(0, 1, 2);
        v.setRationnal(1, 1, 2);
        System.out.print(v.toString() + "\n");

        a = new Rationnal(v.get(0));
        System.out.print(a.toString() + "\n");
        a.mult(b);
        System.out.print(a.toString() + "\n");

        System.out.print(v.toString() + "\n");


        v.append(b);
        System.out.print(v.toString() + "\n");

    }


}
