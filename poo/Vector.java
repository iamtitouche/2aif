public class Vector {
    private int size;
    Rational [] values;

    public Vector(int n_element) {
        this.size = n_element;
        this.values = new Rational[n_element];
    }

    public void setSize(int n) {
        this.size = n;
    }

    public int getDimension() {
        return this.size;
    } 


    public void setRational(int ind, int num, int den) {
        if (ind >= size) {
            throw new IllegalArgumentException("Index cannot be greater or equal than the n_elemnt attribut in Vector instance");
        }

        this.values[ind] = new Rational(num, den);
    }

    public void setRational(int ind, Rational r) {
        if (ind >= size) {
            throw new IllegalArgumentException("Index cannot be greater or equal than the n_elemnt attribut in Vector instance");
        }

        this.values[ind] = new Rational(r);
    }

    public String toString() {
        String result = "( ";
        for (int i = 0; i < size - 1; i++) {
            result += this.values[i].getNum() + " / " + this.values[i].getDen() + ", ";
        }
        result += this.values[size - 1].getNum() + " / " + this.values[size - 1].getDen() + " )";
        return result;
    }

    public Rational get(int i) {
        return this.values[i];
    }

    public void mult(Rational r) {
        for (int i = 0; i < this.size; i++) {
            this.values[i].mult(r);
        }
    }

    public void sum(Vector vect) {
        if (vect.size != this.size) {
            throw new IllegalArgumentException("Vector instances must have the same size");
        }

        for (int i = 0; i < size - 1; i++) {
           this.values[i].sum(vect.values[i]);
        }
    }

    public void append(Rational r) {
        Vector vect = new Vector(this.size + 1);
        for (int i = 0; i < this.size; i++) {
            vect.values[i] = this.values[i];
        }
        vect.values[this.size] = r;
        this.size++;
        this.values = vect.values;
    }


}