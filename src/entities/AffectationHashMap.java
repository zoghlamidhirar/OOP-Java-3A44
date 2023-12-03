package entities;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private Map<Employe, Departement> affectations = new HashMap<>();

    public void ajouterEmployeDepartement(Employe employe, Departement departement) {
        affectations.put(employe, departement);
    }

    public void afficherEmployesEtDepartements() {

        System.out.println("Affectations des employés aux départements :");

        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
    }

    public void supprimerEmploye(Employe employe) {
        affectations.remove(employe);
    }

    public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
        affectations.remove(employe, departement);
    }

    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe employe : affectations.keySet()) {
            System.out.println(employe);
        }
        System.out.println();
    }

    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement departement : affectations.values()) {
            System.out.println(departement);
        }
        System.out.println();
    }

    public boolean rechercherEmploye(Employe employe) {
        return affectations.containsKey(employe);
    }

    public boolean rechercherDepartement(Departement departement) {
        return affectations.containsValue(departement);
    }

    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }

}
