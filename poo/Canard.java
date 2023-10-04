public class Canard extends Animal {
    private String feathersColor;

    public Canard(String name, int weight, String color, Regime regime) {
        super(name, weight, regime);
        this.feathersColor = color;
    }

    public String getFeathersColor() {
        return this.feathersColor;
    }


    public void scream() {
        System.out.println(super.getName() + " crie... Ce canard de " + super.getWeight() + "kg aux plumage " + this.feathersColor);
    }
    

    public String toString() {
        return super.toString() + "\nCouleur des plumes : " + this.feathersColor;
    }

    public int foodQuantity() {
        return 1;
    }
}
