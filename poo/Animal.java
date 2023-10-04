public class Animal {
    private String name;
    private int weight;
    private Regime regime;


    public Animal(String name, int weight, Regime regime) {
        this.name = name;
        this.weight = weight;
        this.regime = regime;
    }

    public int getWeight() {
        return this.weight;
    }

    public Regime getRegime() {
        return this.regime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void scream() {
        System.out.println(this.name + " crie...");
    }

    public String toString() {
        return "Name : " + this.name + "\nPoids : " + this.weight + "\nRégime : " + this.regime.getName();
    }

    public int foodQuantity() {
        return this.weight / 10 + 1;
    }
}