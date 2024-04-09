package pe.financieraoh.business.utilahorros.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PedidoRequest {

    @JsonProperty("codigo")
    private String codigo;

    @JsonProperty("detalle")
    private String detalle;

    @JsonProperty("producto")
    private List<ProductoRequest> producto;

    @JsonProperty("direccion")
    private DireccionRequest direccion;

}
