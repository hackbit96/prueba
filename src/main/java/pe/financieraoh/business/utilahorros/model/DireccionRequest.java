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
public class DireccionRequest {

    @JsonProperty("direccion")
    private String direccion;

    @JsonProperty("referencia")
    private String referencia;
}
