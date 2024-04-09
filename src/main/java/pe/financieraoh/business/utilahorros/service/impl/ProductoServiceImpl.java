package pe.financieraoh.business.utilahorros.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pe.financieraoh.business.utilahorros.domain.Cliente;
import pe.financieraoh.business.utilahorros.domain.Producto;
import pe.financieraoh.business.utilahorros.repository.ClienteRepository;
import pe.financieraoh.business.utilahorros.repository.ProductoRepository;
import pe.financieraoh.business.utilahorros.service.ClienteService;
import pe.financieraoh.business.utilahorros.service.ProductoService;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;
    private final ModelMapper mapper;


    @Override
    public Producto created(Producto request) {
        return productoRepository.save(request);
    }

    @Override
    public List<Producto> created(List<Producto> request) {
        return productoRepository.saveAll(request);
    }
}
