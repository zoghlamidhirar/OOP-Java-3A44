package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{

    private float swimmingSpeed;

     public Dolphin() {
         super();
         System.out.println("Dolphin");
     }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHabitat: " + habitat;
    }

    public void swim() {
        System.out.println("Swimming Dolphin ...");
    }
}
