package entities;

import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private int id;
    private String nomDepartement;
    private int nbreEmploye;

    public Departement() {}

    public Departement(int id, String nomDepartement, int nbreEmploye) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbreEmploye = nbreEmploye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNbreEmploye() {
        return nbreEmploye;
    }

    public void setNbreEmploye(int nbreEmploye) {
        this.nbreEmploye = nbreEmploye;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbreEmploye=" + nbreEmploye +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && nbreEmploye == that.nbreEmploye && Objects.equals(nomDepartement, that.nomDepartement);
    }

    @Override
    public int compareTo(Departement o) {
        return 0;
    }
}
