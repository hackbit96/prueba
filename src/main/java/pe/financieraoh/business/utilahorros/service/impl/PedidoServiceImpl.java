package pe.financieraoh.business.utilahorros.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pe.financieraoh.business.utilahorros.domain.Cliente;
import pe.financieraoh.business.utilahorros.domain.Pedido;
import pe.financieraoh.business.utilahorros.repository.ClienteRepository;
import pe.financieraoh.business.utilahorros.repository.PedidoRepository;
import pe.financieraoh.business.utilahorros.service.ClienteService;
import pe.financieraoh.business.utilahorros.service.PedidoService;

@Slf4j
@Service
@RequiredArgsConstructor
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ModelMapper mapper;

    @Override
    public Pedido created(Pedido request) {
        return pedidoRepository.save(request);
    }
}
