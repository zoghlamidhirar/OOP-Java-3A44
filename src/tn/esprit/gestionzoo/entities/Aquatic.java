package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{

    protected String habitat;

     public Aquatic() {
        super();
         System.out.println("Aquatic");
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("Swimming...");
    }
}
