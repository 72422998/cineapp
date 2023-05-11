package pe.com.cine.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.cine.app.models.PeliculaEntity;

public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Long> {

}
