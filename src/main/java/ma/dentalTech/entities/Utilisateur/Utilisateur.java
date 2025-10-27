package ma.dentalTech.entities.Utilisateur;

import ma.dentalTech.entities.Role.Role;
import ma.dentalTech.entities.enums.Sexe;

import java.time.LocalDate;
import java.util.List;

public class Utilisateur {
    private Long idUser;
    private String nom;
    private String email;
    private String adresse;
    private String cin;
    private String tel;
    private Sexe sexe;
    private String login;
    private String motDePass;
    private LocalDate lastLoginDate;
    private LocalDate dateNaissance;

    private List<Role> roles; // Un utilisateur peut avoir plusieurs rôles

    // Constructeur
    public Utilisateur() {}

    public Utilisateur(Long idUser, String nom, String email, String adresse, String cin, String tel, String sexe,
                       String login, String motDePass, LocalDate lastLoginDate, LocalDate dateNaissance) {
        this.idUser = idUser;
        this.nom = nom;
        this.email = email;
        this.adresse = adresse;
        this.cin = cin;
        this.tel = tel;
        this.sexe = Sexe.valueOf(sexe);
        this.login = login;
        this.motDePass = motDePass;
        this.lastLoginDate = lastLoginDate;
        this.dateNaissance = dateNaissance;
    }

    // Getters et Setters
    public Long GetIdUser() { return idUser; }
    public void SetIdUser(Long idUser) { this.idUser = idUser; }

    public String GetNom() { return nom; }
    public void SetNom(String nom) { this.nom = nom; }

    public String GetEmail() { return email; }
    public void SetEmail(String email) { this.email = email; }

    public String GetAdresse() { return adresse; }
    public void SetAdresse(String adresse) { this.adresse = adresse; }

    public String GetCin() { return cin; }
    public void SetCin(String cin) { this.cin = cin; }

    public String GetTel() { return tel; }
    public void SetTel(String tel) { this.tel = tel; }

    public Sexe GetSexe() { return sexe; }
    public void SetSexe(String sexe) { this.sexe = Sexe.valueOf(sexe); }

    public String GetLogin() { return login; }
    public void SetLogin(String login) { this.login = login; }

    public String GetMotDePass() { return motDePass; }
    public void SetMotDePass(String motDePass) { this.motDePass = motDePass; }

    public LocalDate GetLastLoginDate() { return lastLoginDate; }
    public void SetLastLoginDate(LocalDate lastLoginDate) { this.lastLoginDate = lastLoginDate; }

    public LocalDate GetDateNaissance() { return dateNaissance; }
    public void SetDateNaissance(LocalDate dateNaissance) { this.dateNaissance = dateNaissance; }

    public List<Role> GetRoles() { return roles; }
    public void SetRoles(List<Role> roles) { this.roles = roles; }
}