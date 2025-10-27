package ma.dentalTech.entities.Dossier;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class DossierMedicale {
    private Long idDM;
    private LocalDate dateDeCreation;

    // Relation avec Patient (1-1)
    private Long patientId;
}