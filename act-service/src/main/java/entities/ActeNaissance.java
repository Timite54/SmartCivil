package entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "actes_naissance")
public class ActeNaissance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomComplet;

    @Column(nullable = false)
    private LocalDate dateNaissance;

    @Column(nullable = false)
    private String lieuNaissance;

//    @ManyToOne
//    @JoinColumn(name = "commune_emission_id", nullable = false)
//    private Commune communeEmission;

    @Column(nullable = false)
    private LocalDate dateEmission;

//    @Enumerated(EnumType.STRING)
//    private StatutActe statut;

//    @OneToOne(mappedBy = "acteNaissance")
//    private DemandeActeNaissance demande;

}
