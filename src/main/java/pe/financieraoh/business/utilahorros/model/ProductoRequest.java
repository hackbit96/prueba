package pe.financieraoh.business.utilahorros.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductoRequest {

    @JsonProperty("producto")
    private String producto;

    @JsonProperty("detalle")
    private String detalle;
}
