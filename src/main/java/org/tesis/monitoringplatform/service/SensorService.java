package org.tesis.monitoringplatform.service;

import org.tesis.monitoringplatform.dto.sensor.SensorInfoDTO;
import reactor.core.publisher.Mono;

public interface SensorService {
    Mono<SensorInfoDTO> processData(SensorInfoDTO sensorInfo);
}
