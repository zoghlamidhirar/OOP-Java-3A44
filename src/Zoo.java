import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    String name;
    String city;
    int nbrCages;
    private int animalCompteur;


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;

        this.animals = new ArrayList<>();
        this.animalCompteur = 0; // Initialiser

    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        if (!animals.contains(animal) && animals.size() < nbrCages) { //making sure that the animall is uniquely added
            animals.add(animal);
            return true; // ajout réussii
        } else {
            return false;
        }
    }

    public void displayAnimals() {
        /*
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < animalCompteur; i++) {
            System.out.println("Animal " + (i + 1) + ": " + animals[i].name); //+:Concaténation
        }
         */
        System.out.println("Animaux dans le zoo :");
        for (Animal animal : animals) { //Boucle for avancé: for-each
            System.out.println(animal.name);
        }
    }

    public int searchAnimal(Animal animal) {
        /*
        for (int i = 0; i < animalCompteur; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i; // indicee de l'animal trouvé
            }
        }
        return -1; // Animal non trouvé

             */
            return animals.indexOf(animal);
    }

    public boolean isZooFull() {
        return animals.size() >= nbrCages; //true: super full .. false: still there's places
    }

    public int getAnimalCount() {
        return animals.size();
    }

    public static Zoo compareZoos(Zoo zoo1, Zoo zoo2) {

        int animalCount1 = zoo1.getAnimalCount();
        int animalCount2 = zoo2.getAnimalCount();

        if (animalCount1 > animalCount2) {
            return zoo1;
        } else {
            return zoo2;
        }
    }

    public String getName() {
        return name;
    }




}
