package pe.com.cine.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cine.app.models.FuncionesEntity;

@Repository
public interface FuncionesRepository extends JpaRepository<FuncionesEntity, Long> {

}
