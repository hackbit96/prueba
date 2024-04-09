package pe.financieraoh.business.utilahorros.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pe.financieraoh.business.utilahorros.domain.Cliente;
import pe.financieraoh.business.utilahorros.helper.ResponseClient;
import pe.financieraoh.business.utilahorros.helper.ResponseClientList;
import pe.financieraoh.business.utilahorros.model.CompraRequest;
import pe.financieraoh.business.utilahorros.repository.ClienteRepository;
import pe.financieraoh.business.utilahorros.service.ClienteService;
import pe.financieraoh.business.utilahorros.service.CompraService;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final ModelMapper mapper;

    public Cliente created(Cliente request) {
        log.info("REQUEST CLIENTE {}", request);
        Cliente response = clienteRepository.save(request);
        return response;
    }

}
