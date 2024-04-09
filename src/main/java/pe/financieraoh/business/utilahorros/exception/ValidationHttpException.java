package pe.financieraoh.business.utilahorros.exception;

import org.springframework.http.HttpStatus;

public class ValidationHttpException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final Integer codigo;
    private final HttpStatus status;

    public ValidationHttpException(HttpStatus status, Integer codigo, String mensaje) {
        super(mensaje);
        this.codigo = codigo;
        this.status = status;
    }

    public ValidationHttpException(InteroperabilidadEnum interoperabilidad) {
        super(interoperabilidad.getMensaje());
        this.codigo = interoperabilidad.getCodigo();
        this.status = interoperabilidad.getHttpStatus();
    }
    public ValidationHttpException(InteroperabilidadEnum interoperabilidad,String mensaje) {
        super(mensaje);
        this.codigo = interoperabilidad.getCodigo();
        this.status = interoperabilidad.getHttpStatus();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
