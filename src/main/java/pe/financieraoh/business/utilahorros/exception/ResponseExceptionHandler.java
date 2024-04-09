package pe.financieraoh.business.utilahorros.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pe.financieraoh.business.utilahorros.helper.ResponseClient;

@ControllerAdvice
@RestController
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ValidationHttpException.class)
    public final ResponseEntity<ResponseClient<Void>> validationHttpException(ValidationHttpException ex) {
        return ResponseEntity.status(ex.getStatus())
                .body(ResponseClient.<Void>builder()
                        .codigo(ex.getCodigo())
                        .mensaje(ex.getMessage())
                        .build());
    }

    @ExceptionHandler(ValidationException.class)
    public final ResponseEntity<ResponseClient<Void>> validationException(ValidationException ex) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ResponseClient.<Void>builder()
                        .codigo(ex.getCodigo())
                        .mensaje(ex.getMessage())
                        .build());
    }

    @ExceptionHandler(InternalErrorExceptionHandler.class)
    public final ResponseEntity<ResponseClient<Void>> internalErrorExceptionHandler(InternalErrorExceptionHandler ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ResponseClient.setError(ex.getMessage()));
    }

    @ExceptionHandler(BadRequestException.class)
    public final ResponseEntity<ResponseClient<Void>> badRequestExceptionHandler(BadRequestException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ResponseClient.<Void>builder()
                        .codigo(ex.getCodigo())
                        .mensaje(ex.getMessage())
                        .build());
    }

    @ExceptionHandler(ValidationWhitDataException.class)
    public final ResponseEntity<ResponseClient<Object>> badRequestExceptionHandler(ValidationWhitDataException ex) {
        return ResponseEntity.status(ex.getStatus())
                .body(ResponseClient.builder()
                        .codigo(ex.getCodigo())
                        .mensaje(ex.getMessage())
                        .data(ex.getData())
                        .build());
    }

}
