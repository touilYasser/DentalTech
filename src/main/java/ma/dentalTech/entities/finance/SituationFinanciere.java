package ma.dentalTech.entities.finance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.dentalTech.entities.enums.EnPromo;
import ma.dentalTech.entities.enums.StatutSituationFinanciere;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SituationFinanciere {

    private Long idSF;
    private Double totalPaye;
    private Double resteAPayer;
    private Double credit;
    private EnPromo enPromo;
    private StatutSituationFinanciere statut;
}


