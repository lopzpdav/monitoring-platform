package org.tesis.monitoringplatform.controllers;

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
import org.tesis.monitoringplatform.dto.sensor.SensorInfoDTO;
import org.tesis.monitoringplatform.service.SensorService;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/sensor")
public class SensorController {
    private final SensorService sensorService;

    @PostMapping("/data")
    @Operation(summary = "Save sensor's received data", description = "Endpoint to save sensors data")
    @ResponseStatus(HttpStatus.OK)
    public Mono<SensorInfoDTO> saveSensorData (@Validated @RequestBody SensorInfoDTO request){
        return sensorService.processData(request)
                .thenReturn(request);
    }
}
