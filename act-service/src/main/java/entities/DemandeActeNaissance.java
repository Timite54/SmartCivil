package entities;

import enums.StatutDemande;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "demandes_acte_naissance")
public class DemandeActeNaissance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "utilisateur_id", nullable = false)
//    private User utilisateur;

    @OneToOne
    @JoinColumn(name = "acte_naissance_id")
    private ActeNaissance acteNaissance;

    @Column(nullable = false)
    private LocalDateTime dateCreation;

    @Enumerated(EnumType.STRING)
    private StatutDemande statut;
}
