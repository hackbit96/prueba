package pe.financieraoh.business.utilahorros.service;

import pe.financieraoh.business.utilahorros.domain.Cliente;
import pe.financieraoh.business.utilahorros.helper.ResponseClient;

public interface ClienteService {

    Cliente created(Cliente request);

    ResponseClient<Cliente> getCliente(String numeroDocumento);
}
