package pe.com.cine.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import pe.com.cine.app.models.SalasEntity;
public interface SalasRepository extends JpaRepository<SalasEntity, Long> {

}
