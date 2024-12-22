package entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "communes")
public class Commune {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String codePostal;

    @Column(nullable = false)
    private String adresse;

    @OneToMany(mappedBy = "commune", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ContactMairie> contactsMairie = new ArrayList<>();

//    @OneToMany(mappedBy = "commune")
//    private List<User> utilisateurs = new ArrayList<>();

}
