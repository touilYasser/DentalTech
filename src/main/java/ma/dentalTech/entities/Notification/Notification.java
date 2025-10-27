package ma.dentalTech.entities.Notification;

import ma.dentalTech.entities.enums.PrioriteNotification;
import ma.dentalTech.entities.enums.TitreNotification;
import ma.dentalTech.entities.enums.TypeNotification;

import java.time.LocalDate;
import java.time.LocalTime;

public class Notification {
    private Long id;
    private TitreNotification titre;
    private String message;
    private LocalDate date;
    private LocalTime heure;
    private TypeNotification type;
    private PrioriteNotification priorite;

    // Constructeur
    public Notification() {}

    public Notification(Long id, TitreNotification titre, String message, LocalDate date, LocalTime heure,
                        TypeNotification type, PrioriteNotification priorite) {
        this.id = id;
        this.titre = titre;
        this.message = message;
        this.date = date;
        this.heure = heure;
        this.type = type;
        this.priorite = priorite;
    }

    // Getters et Setters
    public Long GetId() { return id; }
    public void SetId(Long id) { this.id = id; }

    public TitreNotification GetTitre() { return titre; }
    public void SetTitre(TitreNotification titre) { this.titre = titre; }

    public String GetMessage() { return message; }
    public void SetMessage(String message) { this.message = message; }

    public LocalDate GetDate() { return date; }
    public void SetDate(LocalDate date) { this.date = date; }

    public LocalTime GetHeure() { return heure; }
    public void SetHeure(LocalTime heure) { this.heure = heure; }

    public TypeNotification GetType() { return type; }
    public void SetType(TypeNotification type) { this.type = type; }

    public PrioriteNotification GetPriorite() { return priorite; }
    public void SetPriorite(PrioriteNotification priorite) { this.priorite = priorite; }
}