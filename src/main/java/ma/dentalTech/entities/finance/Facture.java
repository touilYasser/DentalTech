package ma.dentalTech.entities.finance;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.dentalTech.entities.enums.StatutFacture;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Facture {

    private Long idFacture;
    private Double montantTotal;
    private Double netAPayer;
    private Double resteAPayer;
    private StatutFacture statut;
    private LocalDateTime dateFacture;
}


