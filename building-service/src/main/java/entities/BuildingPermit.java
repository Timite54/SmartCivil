package entities;

import enums.StatutPermis;
import enums.TypeConstruction;
import jakarta.persistence.*;
import lombok.*;

@Setter @Getter @Builder @Entity
@Table(name = "permis_construire")
@AllArgsConstructor @NoArgsConstructor
public class BuildingPermit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "proprietaire_id", nullable = false)
//    private User proprietaire;

    @Column(nullable = false)
    private String adresseTerrain;

    @Enumerated(EnumType.STRING)
    private TypeConstruction typeConstruction;

    @Column(nullable = false)
    private Double surfaceConstruite;

//    @OneToOne(mappedBy = "permis")
//    private DemanPermis demande;

    @Enumerated(EnumType.STRING)
    private StatutPermis statut;


}
