public class Rationnal {
    private int num;
    private int den = 1;

    public Rationnal() {

    }

    public Rationnal(int x, int y) {
        this.num  = x;
        this.setDen(y);
        this.reduce();
    }

    public Rationnal(Rationnal other) {
        this.setValue(other.num, other.den);
        this.reduce();
    }

    public String toString() {
        return this.num + " / " + this.den;
    }

    public void setNum(int x) {
        this.num = x;
    }

    public void setDen(int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Den attribut cannot be 0\n");
        }
        this.den = y;
    }

    public void setValue(int x, int y) {
        setNum(x);
        setDen(y);
    }

    public int getNum() {
        return this.num;
    }

    public int getDen() {
        return this.den;
    }

    
    public void reduce() {
        int a = this.num;
        int b = this.den;
        int r;
        while (b != 0) {
            r = a % b; a = b; b = r;
        }
        this.num = this.num / a;
        this.den = this.den / a;
    }

    public void mult(Rationnal a) {
        this.num = this.num * a.num;
        this.den = this.den * a.den;
        this.reduce();
    }

    public void sum(Rationnal a) {
        this.num = this.num * a.den + this.den * a.num;
        this.den = this.den * a.den;
        this.reduce();
    }


    public static Rationnal mult_2(Rationnal a, Rationnal b) {
        Rationnal product = new Rationnal();
        product.num = a.num * b.num;
        product.den = a.den * b.den;
        product.reduce();
        return product;
    }

}