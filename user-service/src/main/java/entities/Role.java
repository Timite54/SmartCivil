package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter @Getter @Builder @Entity
@AllArgsConstructor @NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nomRole;

    @ManyToMany(mappedBy = "roles")
    private Set<User> utilisateurs = new HashSet<>();
}
