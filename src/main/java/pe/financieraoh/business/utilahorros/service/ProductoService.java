package pe.financieraoh.business.utilahorros.service;

import pe.financieraoh.business.utilahorros.domain.Cliente;
import pe.financieraoh.business.utilahorros.domain.Producto;

import java.util.List;

public interface ProductoService {

    Producto created(Producto request);

    List<Producto> created(List<Producto> request);
}
