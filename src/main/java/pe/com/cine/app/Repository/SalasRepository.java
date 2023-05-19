package pe.com.cine.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cine.app.models.SalasEntity;

@Repository

public interface SalasRepository extends JpaRepository<SalasEntity, Long> {

}
ñ