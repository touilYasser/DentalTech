package ma.dentalTech.entities.dossier;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Consultation {
    private Long id;
    private LocalDateTime dateConsultation;
    private String motifs;
    private String anamnese;
    private String examenClinique;
    private String diagnostic;
    private String traitement;
    private String observations;
    private LocalDateTime dateCreation;
    
    // Relations
    private Long patientId;
    private Long medecinId;
    private Long rdvId;
}

