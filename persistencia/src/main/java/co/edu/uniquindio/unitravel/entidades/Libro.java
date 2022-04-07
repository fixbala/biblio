package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Libro implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 13)
    private String isbn;

    @Column(nullable = false,length = 200)
    private String nombre;

    @Max(9999)
    @Column(nullable = false)
    private int anio;

    @PositiveOrZero
    @Column(nullable = false)
    private  int unidades;


    public Libro(String isbn,String nombre, int anio, int unidades) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.anio = anio;
        this.unidades = unidades;

    }
}
