package pe.financieraoh.business.utilahorros.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompraRequest {

    @JsonProperty("clienteRequest")
    private ClienteRequest clienteRequest;

    @JsonProperty("pedidoRequest")
    private PedidoRequest pedidoRequest;


}
