package main;

import entities.*;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Departement dep1 = new Departement(1, "IT", 50);
        Departement dep2 = new Departement(2, "HR", 30);
        Departement dep3 = new Departement(3, "Finance", 40);

        DepartementHashSet departementHashSet = new DepartementHashSet();

        departementHashSet.ajouterDepartement(dep1);
        departementHashSet.ajouterDepartement(dep2);
        departementHashSet.ajouterDepartement(dep3);

        System.out.println("Liste des départements :");
        departementHashSet.displayDepartement();

        System.out.println("Recherche du département 'HR' : " + departementHashSet.rechercherDepartement("HR"));

        // Test rechercherDepartement avec un objet
        System.out.println("Recherche du département 'dep1' : " + departementHashSet.rechercherDepartement(dep1));


        System.out.println("Liste des départements triés par ID :");
        TreeSet<Departement> sortedDepartements = departementHashSet.trierDepartementById();
        for (Departement d : sortedDepartements) {
            System.out.println(d);
        }

        departementHashSet.supprimerDepartement(dep2);

        System.out.println("Liste des départements après suppression du département 'HR' :");
        departementHashSet.displayDepartement();



//THe code down belooow isss to test in the main for the previous Prosit
        /*

        SocieteArrayList societe = new SocieteArrayList();

        // Create some employees
        Employe employe1 = new Employe(1, "Zoghlami", "Dhirar", "IT", 2);
        Employe employe2 = new Employe(2, "Zoghlami2", "Dhirar2", "HR", 3);
        Employe employe3 = new Employe(3, "Zoghlami3", "Dhirar3", "Finance", 1);

        // Add employees to the company
        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe2);
        societe.ajouterEmploye(employe3);

        // Display all employees
        System.out.println("List of employees:");
        societe.displayEmploye();
        System.out.println();

        // Search for an employee by name
        String searchName = "Zoghlami2";
        boolean foundByName = societe.rechercherEmploye(searchName);
        System.out.println("Employee with name '" + searchName + "' found: " + foundByName);
        System.out.println();

        // Search for an employee by object
        boolean foundByObject = societe.rechercherEmploye(employe2);
        System.out.println("Employee found by object: " + foundByObject);
        System.out.println();

        // Remove an employee
        // societe.supprimerEmploye(employe1);

        // Display the updated list of employees
        // System.out.println("List of employees after removal:");
        societe.displayEmploye();
        System.out.println();

        // Sort employees by ID and display the sorted list
        societe.trierEmployeParId();
        System.out.println("List of employees after sorting by ID:");
        societe.displayEmploye();
        System.out.println();

        // Sort employees by name, department, and grade and display the sorted list
        societe.trierEmployeParNomDepartementEtGrade();
        System.out.println("List of employees after sorting by name, department, and grade:");
        societe.displayEmploye();


*/



    }
}