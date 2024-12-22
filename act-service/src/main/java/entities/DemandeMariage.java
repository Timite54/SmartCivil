package entities;


import enums.StatutDemande;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "demandes_mariage")
public class DemandeMariage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "utilisateur_id", nullable = false)
//    private User utilisateur;

//    @ManyToOne
//    @JoinColumn(name = "commune_id", nullable = false)
//    private Commune communeChoisie;

    @OneToOne
    @JoinColumn(name = "acte_mariage_id")
    private ActeMariage acteMariage;

    @Column(nullable = false)
    private LocalDateTime dateCreation;

    @Enumerated(EnumType.STRING)
    private StatutDemande statut;

}
