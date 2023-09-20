public class ExtensibleVector extends Vector {

    public ExtensibleVector(int n_element) {
        super(n_element);
    }


    public void append(Rational r) {
        Vector vect = new Vector(super.getDimension() + 1);
        for (int i = 0; i < super.getDimension(); i++) {
            vect.values[i] = this.values[i];
        }
        vect.values[super.getDimension()] = r;
        super.setSize(getDimension() + 1);
        this.values = vect.values;
    }
    
}
