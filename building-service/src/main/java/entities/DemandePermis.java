package entities;

import enums.StatutPermis;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "demandes_permis")
public class DemandePermis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User utilisateur;

//    @OneToOne
//    @JoinColumn(name = "permis_id")
//    private PermisdeConstruire permis;

    @Column(nullable = false)
    private LocalDateTime dateCreation;

    @Enumerated(EnumType.STRING)
    private StatutPermis statut;

}