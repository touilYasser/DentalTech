package ma.dentalTech.entities.Role;

import ma.dentalTech.entities.enums.LibelleRole;

import java.util.List;

public class Role {
    private Long idRole;
    private LibelleRole libelle;
    private List<String> privileges;

    // Constructeur
    public Role() {}

    public Role(Long idRole, LibelleRole libelle, List<String> privileges) {
        this.idRole = idRole;
        this.libelle = libelle;
        this.privileges = privileges;
    }

    // Getters et Setters
    public Long GetIdRole() { return idRole; }
    public void SetIdRole(Long idRole) { this.idRole = idRole; }

    public LibelleRole GetLibelle() { return libelle; }
    public void SetLibelle(LibelleRole libelle) { this.libelle = libelle; }

    public List<String> GetPrivileges() { return privileges; }
    public void SetPrivileges(List<String> privileges) { this.privileges = privileges; }
}