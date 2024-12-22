package entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "actes_mariage")
public class ActeMariage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate dateMariage;

    @Column(nullable = false)
    private String lieuMariage;

//    @ManyToOne
//    @JoinColumn(name = "commune_emission_id", nullable = false)
//    private Commune communeEmission;

//    @ManyToOne
//    @JoinColumn(name = "epoux_id", nullable = false)
//    private User epoux;

//    @ManyToOne
//    @JoinColumn(name = "epouse_id", nullable = false)
//    private User epouse;

    @OneToOne(mappedBy = "acteMariage")
    private DemandeMariage demande;

}
