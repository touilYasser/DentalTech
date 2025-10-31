package ma.dentalTech.entities.finance;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Charges {

    private Long id;
    private String titre;
    private String description;
    private Double montant;
    private LocalDateTime date;
}


