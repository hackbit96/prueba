package pe.financieraoh.business.utilahorros.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.financieraoh.business.utilahorros.domain.Cliente;
import pe.financieraoh.business.utilahorros.helper.BaseResponse;
import pe.financieraoh.business.utilahorros.helper.ResponseClient;
import pe.financieraoh.business.utilahorros.model.CompraRequest;
import pe.financieraoh.business.utilahorros.service.ClienteService;
import pe.financieraoh.business.utilahorros.service.CompraService;

@RestController
@RequestMapping(value = "v1/cliente")
@Api(value = "CompraController", produces = "application/json", tags = {"Controlador Compra"})
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @ApiOperation(value = "Cliente")
    @GetMapping("/{numero-documento}")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Registrar Compra"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Error en el servidor", response = BaseResponse.class)})
    public ResponseEntity<ResponseClient<Cliente>> get(@PathVariable(name = "numero-documento") String numeroDocumento) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.getCliente(numeroDocumento));
    }

}
