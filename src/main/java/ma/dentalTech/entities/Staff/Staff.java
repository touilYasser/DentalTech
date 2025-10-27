package ma.dentalTech.entities.Staff;

import ma.dentalTech.entities.Utilisateur.Utilisateur;
import java.time.LocalDate;

public class Staff extends Utilisateur {
    private Double salaire;
    private Double prime;
    private LocalDate dateRecrutement;
    private int soldeConge;

    // Constructeur
    public Staff() {}

    public Staff(Double salaire, Double prime, LocalDate dateRecrutement, int soldeConge) {
        this.salaire = salaire;
        this.prime = prime;
        this.dateRecrutement = dateRecrutement;
        this.soldeConge = soldeConge;
    }

    // Getters et Setters
    public Double GetSalaire() { return salaire; }
    public void SetSalaire(Double salaire) { this.salaire = salaire; }

    public Double GetPrime() { return prime; }
    public void SetPrime(Double prime) { this.prime = prime; }

    public LocalDate GetDateRecrutement() { return dateRecrutement; }
    public void SetDateRecrutement(LocalDate dateRecrutement) { this.dateRecrutement = dateRecrutement; }

    public int GetSoldeConge() { return soldeConge; }
    public void SetSoldeConge(int soldeConge) { this.soldeConge = soldeConge; }
}