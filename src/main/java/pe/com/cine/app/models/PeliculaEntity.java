package pe.com.cine.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class PeliculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String director;
    private Integer anio_estreno;
    private Integer duracion;
    private String genero;
    private String sinopsis;

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getAnio_estreno() {
        return anio_estreno;
    }

    public void setAnio_estreno(Integer anio_estreno) {
        this.anio_estreno = anio_estreno;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public PeliculaEntity(Long id, String titulo, String director, Integer anio_estreno, Integer duracion,
            String genero, String sinopsis) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.anio_estreno = anio_estreno;
        this.duracion = duracion;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }
    
}
