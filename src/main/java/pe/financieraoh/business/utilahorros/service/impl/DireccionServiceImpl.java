package pe.financieraoh.business.utilahorros.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pe.financieraoh.business.utilahorros.domain.Cliente;
import pe.financieraoh.business.utilahorros.domain.Direccion;
import pe.financieraoh.business.utilahorros.repository.ClienteRepository;
import pe.financieraoh.business.utilahorros.repository.DireccionRepository;
import pe.financieraoh.business.utilahorros.service.ClienteService;
import pe.financieraoh.business.utilahorros.service.DireccionService;

@Slf4j
@Service
@RequiredArgsConstructor
public class DireccionServiceImpl implements DireccionService {

    private final DireccionRepository direccionRepository;
    private final ModelMapper mapper;

    @Override
    public Direccion created(Direccion request) {
        return direccionRepository.save(request);
    }
}
