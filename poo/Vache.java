public class Vache extends Animal {
    private int nb_tache;

    public Vache(String name, int weight, int nb_tache, Regime regime) {
        super(name, weight, regime);
        this.nb_tache = nb_tache;
    }

    public int getNbTache() {
        return this.nb_tache;
    }


    public void scream() {
        System.out.println(super.getName() + " crie... Cette vache de " + super.getWeight() + "kg à " + this.nb_tache + " tâches");
    }


    public String toString() {
        return super.toString() + "\nNombre de tâches : " + this.nb_tache;
    }
    
    public int foodQuantity() {
        return super.getWeight() / 20 + 1;
    }
}
