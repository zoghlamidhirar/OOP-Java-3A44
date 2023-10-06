package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public boolean isMammal() {
        return isMammal;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with verification
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif.");
        }
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
}
