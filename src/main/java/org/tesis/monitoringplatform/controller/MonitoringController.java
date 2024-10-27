package org.tesis.monitoringplatform.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.tesis.monitoringplatform.domain.Pollution;
import org.tesis.monitoringplatform.dto.SensorInfoDTO;
import org.tesis.monitoringplatform.service.MonitoringService;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/monitoring")
public class MonitoringController {
    private final MonitoringService monitoringService;

    @PostMapping("/info")
    @Operation(summary = "Save sensor's received info", description = "Endpoint para guardar informacion recibida de los sensores")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Pollution> saveStudent (@Validated @RequestBody SensorInfoDTO request){
        return monitoringService.procesarInfo(request);
    }

    /**
     * ENDPOINT -> GUARDAR DATOS DE USUARIO (LÍMITES DE PORCENTAJES DE POLLUTION)
     *          -> DEVUELVE DATOS QUE SOLICITA LA APP
     *          -> SECURITY JWT
     * DIVIDIR CON NUEVA ESTRUCTURA data.value
     * NUEVA COLECCIÓN sensorInfo
     *
     */
}
