package pe.financieraoh.business.utilahorros.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.financieraoh.business.utilahorros.helper.BaseResponse;
import pe.financieraoh.business.utilahorros.helper.ResponseClient;
import pe.financieraoh.business.utilahorros.model.CompraRequest;
import pe.financieraoh.business.utilahorros.service.CompraService;

@RestController
@RequestMapping(value = "v1/compra")
@Api(value = "CompraController", produces = "application/json", tags = {"Controlador Compra"})
@RequiredArgsConstructor
public class CompraController {

    private final CompraService service;

    @ApiOperation(value = "Compra")
    @PostMapping
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Registrar Compra"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Error en el servidor", response = BaseResponse.class)})
    public ResponseEntity<ResponseClient<Void>> created(@RequestBody CompraRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.created(request));
    }

}
