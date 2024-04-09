package pe.financieraoh.business.utilahorros.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PEDIDO", schema = "EMPRESA")
public class Pedido {

    @Id
    @Column(name = "ID_PEDIDO")
    private Long idPedido;

    @Column(name = "CODIGO")
    private String codigo;

    @Column(name = "DETALLE")
    private String detalle;

}
