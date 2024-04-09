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
@Table(name = "DIRECCION", schema = "EMPRESA")
public class Direccion {

    @Id
    @Column(name = "ID_DIRECCION")
    private Long idDireccion;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "referencia")
    private String referencia;

}
