package edu.ec.ucacue.octavo.biblioteca.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "libro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Libro {


    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
