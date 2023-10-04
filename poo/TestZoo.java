public class TestZoo {

    public static void main(String[] args) {
        String[] array_name = new String[7];
        Zoo zoo = new Zoo("Le Zoooooo");

        Regime regime = new Regime("raisins", 12.3);

        array_name[0] = "Marie";
        array_name[1] = "Mathieu";
        array_name[2] = "Jean";
        array_name[3] = "Jeanne";
        array_name[4] = "Jean N°2";
        array_name[5] = "Jean-Jeremy-Gustave";
        array_name[6] = "Le grand monarque";


        for (int i = 0; i < 5; i++) {
            Animal animal = new Animal(array_name[i], (i + 1) * 17, regime);
            zoo.ajouteAnimal(animal);
        }

        Vache cow = new Vache(array_name[5], 400, 23, regime);
        zoo.ajouteAnimal(cow);

        Canard duck = new Canard(array_name[6], 678, "Violet", regime);
        zoo.ajouteAnimal(duck);

        zoo.crier();


        System.out.println(zoo.totalFood());
    }
    
}
