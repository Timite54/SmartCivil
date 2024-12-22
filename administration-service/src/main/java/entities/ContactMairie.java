package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts_mairie")
public class ContactMairie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telephone;

    @ManyToOne
    @JoinColumn(name = "commune_id", nullable = false)
    private Commune commune;
}
