package pe.com.cine.app.models;

import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "funciones")
public class FuncionesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_sala")
    private SalasEntity salas;
    @ManyToOne
    @JoinColumn(name = "id_pelicula")
    private PeliculaEntity peliculas;

    private Date fecha;
    private LocalTime hora;

    public FuncionesEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SalasEntity getSalas() {
        return salas;
    }

    public void setSalas(SalasEntity salas) {
        this.salas = salas;
    }

    public PeliculaEntity getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(PeliculaEntity peliculas) {
        this.peliculas = peliculas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

}
