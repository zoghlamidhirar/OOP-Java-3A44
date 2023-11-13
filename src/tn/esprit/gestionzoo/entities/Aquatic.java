package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Carnivore;
import tn.esprit.gestionzoo.enums.Food;


public class Aquatic extends Animal implements Carnivore<Food> {
//public abstract class Aquatic extends Animal{

    protected String habitat;

     public Aquatic() {
        super();
         System.out.println("Aquatic");
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("This aquatic animal is eating meat.");
        } else {
            System.out.println("This aquatic animal does not eat meat.");
        }
    }

    public void swim() {
        System.out.println("Swimming...");
    }
    //public abstract void swim();

    @Override
    public boolean equals(Object objet) {
        if (this == objet) {
            return true; // mm objets
        }
        if (objet == null || getClass() != objet.getClass()) {
            return false; // objets diff
        }
        Aquatic obj = (Aquatic) objet;
        return name.equals(obj.name) && age == obj.age && habitat.equals(obj.habitat);
    }

}
