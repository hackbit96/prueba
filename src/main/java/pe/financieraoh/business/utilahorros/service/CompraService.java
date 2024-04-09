package pe.financieraoh.business.utilahorros.service;

import pe.financieraoh.business.utilahorros.helper.ResponseClient;
import pe.financieraoh.business.utilahorros.helper.ResponseClientList;
import pe.financieraoh.business.utilahorros.model.CompraRequest;

public interface CompraService {

    ResponseClient<Void> created(CompraRequest request);

    ResponseClientList<Void> getMapfre();

}
