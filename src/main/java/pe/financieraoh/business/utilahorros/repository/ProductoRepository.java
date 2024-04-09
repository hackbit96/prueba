package pe.financieraoh.business.utilahorros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.financieraoh.business.utilahorros.domain.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
