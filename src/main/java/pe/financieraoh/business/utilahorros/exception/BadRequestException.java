package pe.financieraoh.business.utilahorros.exception;

import pe.financieraoh.business.utilahorros.constant.Constant;

public class BadRequestException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final Integer codigo;

    public BadRequestException(Integer codigo, String mensaje) {
        super(mensaje);
        this.codigo = codigo;
    }

    public BadRequestException(String mensaje) {
        super(mensaje);
        this.codigo = Constant.CODIGO_ERROR;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
