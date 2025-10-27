package ma.dentalTech.entities.Agenda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.dentalTech.entities.enums.StatutRDV;
import java.time.LocalDate;
import java.time.LocalTime;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class RDV {
    private Long idRDV;
    private LocalDate date;
    private LocalTime heure;
    private String motif;
    private StatutRDV statut;
    private String noteMedecin;

    // Relations avec IDs
    private Long patientId;
    private Long dossierMedicaleId;
    private Long medecinId;
}