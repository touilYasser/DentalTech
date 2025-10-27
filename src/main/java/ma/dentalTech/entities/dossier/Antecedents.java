package ma.dentalTech.entities.Dossier;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.dentalTech.entities.enums.NiveauRisque;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Antecedents {
    private Long idAntecedent;
    private String nom;
    private String categorie;
    private NiveauRisque niveauDeRisque;

    // Relation avec Patient (1-*)
    private Long patientId;
}