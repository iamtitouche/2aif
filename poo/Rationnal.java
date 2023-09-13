public class Rationnal {
    private int num;
    private int den = 1;

    public String toString() {
        return num + " / " + den;
    }

    public void setNum(int x) {
        num = x;
    }

    public void setDen(int y) {
        if (y == 0) {
            System.out.print("Den attribut cannot be 0\n");
            return;
        }
        den = y;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    
    public void reduce() {
        int a = num;
        int b = den;
        int r;
        while (b != 0) {
            r = a % b; a = b; b = r;
        }
        num = num / a;
        den = den / a;
    }

    public void mult(Rationnal a) {
        num = num * a.num;
        den = den * a.den;
        reduce();
    }

    public void sum(Rationnal a) {
        num = num * a.den + den * a.num;
        den = den * a.den;
    }

}