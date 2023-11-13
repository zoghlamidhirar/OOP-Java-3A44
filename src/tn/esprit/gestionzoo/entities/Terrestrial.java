package tn.esprit.gestionzoo.entities;


import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;


public class Terrestrial extends Animal implements Omnivore<Food> {
//public class Terrestrial extends Animal{

    private int nbrLegs;

    public Terrestrial() {
        super();
        System.out.println("Terrestrial");
    }

    public Terrestrial(String terrestrialFamily, String terrestrialAnimal, int i, boolean b, int i1) {
        super(terrestrialFamily,terrestrialAnimal,i,b);
        this.nbrLegs=i1;
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("This terrestrial animal is eating both plants and meat.");
        } else {
            System.out.println("This terrestrial animal does not eat both plants and meat.");
        }
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("This terrestrial animal is eating meat.");
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("This terrestrial animal is eating  plants.");
    }
}
