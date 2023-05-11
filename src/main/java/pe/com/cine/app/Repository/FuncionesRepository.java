package pe.com.cine.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.cine.app.models.FuncionesEntity;

public interface FuncionesRepository extends JpaRepository<FuncionesEntity, Long> {

}
