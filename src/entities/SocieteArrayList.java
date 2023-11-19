package entities;

import entities.Employe;
import interfaces.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe> listeEmployes;

    //Constructor
    public SocieteArrayList() {
        listeEmployes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    //Without the predifined method contains
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : listeEmployes)  //for avancé //like foreach in php
        {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    //with the predifined method contains
    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : listeEmployes) {
            System.out.println(employe);
        }
    }

    // With Comparable
    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes, Comparator.comparingInt(Employe::getId));
    }

    //With Comparator
    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(listeEmployes, Comparator.comparing(Employe::getNom)
                .thenComparing(Employe::getNomDepartement)
                .thenComparingInt(Employe::getGrade));
    }
}
