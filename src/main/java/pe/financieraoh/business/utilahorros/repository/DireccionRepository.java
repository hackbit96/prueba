package pe.financieraoh.business.utilahorros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.financieraoh.business.utilahorros.domain.Direccion;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {

}
