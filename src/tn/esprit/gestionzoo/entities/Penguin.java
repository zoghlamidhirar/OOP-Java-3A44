package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{

    private float swimmingDepth;

     public Penguin() {
        super();
        System.out.println("Penguin");
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHabitat: " + habitat;
    }

    public void swim() {
        System.out.println("Swimming Penguin ...");
    }

    public float getSwimmingDepth() {
         return this.swimmingDepth;
    }
}
