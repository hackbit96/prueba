package pe.financieraoh.business.utilahorros.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.financieraoh.business.utilahorros.domain.Cliente;
import pe.financieraoh.business.utilahorros.domain.Direccion;
import pe.financieraoh.business.utilahorros.domain.Pedido;
import pe.financieraoh.business.utilahorros.domain.Producto;
import pe.financieraoh.business.utilahorros.helper.ResponseClient;
import pe.financieraoh.business.utilahorros.helper.ResponseClientList;
import pe.financieraoh.business.utilahorros.model.CompraRequest;
import pe.financieraoh.business.utilahorros.model.ProductoRequest;
import pe.financieraoh.business.utilahorros.service.ClienteService;
import pe.financieraoh.business.utilahorros.service.CompraService;
import pe.financieraoh.business.utilahorros.service.DireccionService;
import pe.financieraoh.business.utilahorros.service.PedidoService;
import pe.financieraoh.business.utilahorros.service.ProductoService;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class CompraServiceImpl implements CompraService {

    private final ClienteService clienteService;
    private final PedidoService pedidoService;
    private final DireccionService direccionService;
    private final ProductoService productoService;


    @Override
    public ResponseClient<Void> created(CompraRequest request) {
        clienteService.created(Cliente.builder()
                .tipoDocumento(request.getClienteRequest().getTipoDocumento())
                .numeroDocumento(request.getClienteRequest().getNumeroDocumento())
                .apellidoMaterno(request.getClienteRequest().getApellidoMaterno())
                .apellidoPaterno(request.getClienteRequest().getApellidoPaterno())
                .nombre(request.getClienteRequest().getNombre())
                .build());
        pedidoService.created(Pedido.builder()
                .codigo(request.getPedidoRequest().getCodigo())
                .detalle(request.getPedidoRequest().getDetalle())
                .build());
        direccionService.created(Direccion.builder()
                .direccion(request.getPedidoRequest().getDireccion().getDireccion())
                .referencia(request.getPedidoRequest().getDireccion().getReferencia())
                .build());
        List<ProductoRequest> productos = request.getPedidoRequest().getProducto();
        List<Producto> productoRequest = productos.stream()
                .map(item -> Producto.builder()
                        .producto(item.getProducto())
                        .detalle(item.getDetalle())
                        .build())
                .collect(Collectors.toList());
        productoService.created(productoRequest);
        return ResponseClient.setOk();
    }

    @Override
    public ResponseClientList<Void> getMapfre() {
        return null;
    }
}
