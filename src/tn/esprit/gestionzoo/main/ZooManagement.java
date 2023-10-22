package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de cages : ");
        int nbrCages = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character...

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        System.out.println(zooName + " comporte " + nbrCages + " cages ");


        Animal lion = new Animal("Fel","Lion",5,true);
        Animal lion1 = new Animal("Feld","Liond",5,true);


        Zoo myZoo = new Zoo("Mon zoo", "Ma ville", 25);

        // Création d'animaux
        Animal pig = new Animal("Pi", "Pig", 5, true);
        Animal penguin = new Animal("Pen", "Penguin", 10, true);

        // Ajout d'animaux au zoo
        boolean ajoutLion = myZoo.addAnimal(lion);
        boolean ajoutLion1 = myZoo.addAnimal(lion1);
        boolean ajoutPig = myZoo.addAnimal(pig);
        boolean ajoutPenguin = myZoo.addAnimal(penguin);

        //Affichage des animaux àà travers la méthode displayAnimals()
        myZoo.displayAnimals();

        // Affichage des résultats
        System.out.println("Ajout du pig au zoo : " + ajoutPig);
        System.out.println("Ajout de penguin au zoo : " + ajoutPenguin);

        // Afficher les informations du zoo en utilisant la méthode displayZoo()
        myZoo.displayZoo();

        // Afficher le zoo directement avec System.out.println()
        System.out.println(myZoo);

        // Afficher le zoo directement avec toString()
        System.out.println(myZoo.toString());

/*
        // Affectation de l'animal au zoo (ajout de l'animal à la liste d'animaux du zoo)
        //myZoo.animals[0] = lion;

        // Affichage d'informations sur l'animal et le zoo
        //System.out.println("tn.esprit.gestionzoo.entities.Animal créé : " + lion.name);
        //System.out.println("tn.esprit.gestionzoo.entities.Zoo créé : " + myZoo.name);
 */

        /*
        // Recherche
        tn.esprit.gestionzoo.entities.Animal AnimalX = new tn.esprit.gestionzoo.entities.Animal("XXX", "Tiger", 2, true);
        int index = myZoo.searchAnimal(AnimalX);

        if (index != -1) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal trouvé à l'indice: " + index);
        } else {
            System.out.println("tn.esprit.gestionzoo.entities.Animal non trouvé!!");
        }
         */

        // Rechercher un animal par son nom (chercher "Lion 1")
        int indexLion = myZoo.searchAnimal(lion);
        int indexLion1 = myZoo.searchAnimal(lion1);

        if (indexLion != -1) {
            System.out.println("Lion 1 trouvé à l'indice " + indexLion);
        } else {
            System.out.println("Lion 1 non trouvé.");
        }

        if (indexLion1 != -1) {
            System.out.println("Lion 2 trouvé à l'indice " + indexLion1);
        } else {
            System.out.println("Lion 2 non trouvé.");
        }

        // Prosit 3 //To test the methods I did
        Zoo zoo1 = new Zoo("tn.esprit.gestionzoo.entities.Zoo 1", "Ville 1", 25); // I shouldn't add the 3rd param
        Zoo zoo2 = new Zoo("tn.esprit.gestionzoo.entities.Zoo 2", "Ville 2", 25); //cause it is a constant .. final ..

        // Création d'animaux
        Animal lion3 = new Animal("YYY", "Lion", 22, true);
        Animal elephant = new Animal("EEE", "Elephant", 33, true);
        Animal giraffe = new Animal("GGG", "Giraffe", 8, false);

        // Ajout d'animaux au zoo
        zoo1.addAnimal(lion3);
        zoo1.addAnimal(elephant);

        zoo2.addAnimal(giraffe);

        // Vérification si les zoo sont pleins
        System.out.println("tn.esprit.gestionzoo.entities.Zoo 1 est plein : " + zoo1.isZooFull()); // It should be false
        System.out.println("tn.esprit.gestionzoo.entities.Zoo 2 est plein : " + zoo2.isZooFull()); // It should be false too

        // Comparaison des zoo
        Zoo zooWithMostAnimals = Zoo.compareZoos(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooWithMostAnimals.getName());

        //Aquatic aqua1 = new Aquatic();
        Dolphin dol1 = new Dolphin();
        Penguin penn = new Penguin();

        //Aquatic aqua2 = new Aquatic("AquaticFamily", "AquaticAnimal", 10, true, "AquaticHabitat");
        Dolphin dol2 = new Dolphin("DolphinFamily", "Dolphin", 5, true, "Ocean", 20.0f);
        Penguin penn2 = new Penguin("PenguinFamily", "Penguin", 3, true, "Antarctica", 10.0f);

        // Print the objects
        //System.out.println(aqua2);
        System.out.println(dol2);
        System.out.println(penn2);

        //aqua2.swim();
        dol2.swim();
        penn2.swim();

        Zoo myZoo2 = new Zoo("Zooooo","Tunis",25);


        Aquatic penguin1 = new Penguin();
        Aquatic dolphin1 = new Dolphin();

        myZoo2.addAquaticAnimal(penguin1);
        myZoo2.addAquaticAnimal(dolphin1);


        for (Aquatic animal : myZoo2.aquaticAnimals) {
            if (animal != null) {
                animal.swim();
            }
        }


        scanner.close();
    }

}
