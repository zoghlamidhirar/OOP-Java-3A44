package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{

    protected String habitat;

     public Aquatic() {
        super();
         System.out.println("Aquatic");
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void swim();

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
