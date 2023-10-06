package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Animal> animals;
    private String name;
    String city;
    private int nbrCages;
    private int animalCompteur;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public int getAnimalCompteur() {
        return animalCompteur;
    }

    public void setAnimalCompteur(int animalCompteur) {
        this.animalCompteur = animalCompteur;
    }

    public Zoo(String name, String city, int nbrCages) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        }
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new ArrayList<>();
        this.setAnimalCompteur(0);
    }


    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        /*
        if (!animals.contains(animal) && animals.size() < nbrCages) { //making sure that the animall is uniquely added
            animals.add(animal);
            return true; // ajout réussii
        } else {
            return false;
        }
         */
        if (!isZooFull()) {
            animals.add(animal);
            return true; // Ajout réussi
        } else {
            return false; // Le zoo est plein
        }
    }

    public void displayAnimals() {
        /*
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < animalCompteur; i++) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal " + (i + 1) + ": " + animals[i].name); //+:Concaténation
        }
         */
        System.out.println("Animaux dans le zoo :");
        for (Animal animal : animals) { //Boucle for avancé: for-each
            System.out.println(animal.getName());
        }
    }

    public int searchAnimal(Animal animal) {
        /*
        for (int i = 0; i < animalCompteur; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i; // indicee de l'animal trouvé
            }
        }
        return -1; // tn.esprit.gestionzoo.entities.Animal non trouvé

             */
            return animals.indexOf(animal);
    }

    public boolean isZooFull() {

        return animals.size() >= nbrCages; //true: super full .. false: still there's places

    }

    public int getAnimalCount() {
        return animals.size();
    }

    public static Zoo compareZoos(Zoo zoo1, Zoo zoo2) { //static because we will be using this
                                                        //this without the need to "Instancier" an object
        int animalCount1 = zoo1.getAnimalCount();
        int animalCount2 = zoo2.getAnimalCount();

        if (animalCount1 > animalCount2) {
            return zoo1;
        } else {
            return zoo2;
        }
    }






}
