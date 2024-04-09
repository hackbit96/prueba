package pe.financieraoh.business.utilahorros.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCTO_PEDIDO", schema = "EMPRESA")
public class Producto {

    @Id
    @Column(name = "ID_PRODUCTO_PEDIDO")
    private Long idProductoxPedido;

    @Column(name = "PRODUCTO")
    private String producto;

    @Column(name = "DETALLE")
    private String detalle;


}
