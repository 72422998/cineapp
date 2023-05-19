package pe.com.cine.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cine.app.models.BoletosEntity;

@Repository
public interface BoletosRepository extends JpaRepository<BoletosEntity, Long> {

}
