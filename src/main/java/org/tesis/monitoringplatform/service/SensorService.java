package org.tesis.monitoringplatform.service;

import org.tesis.monitoringplatform.domain.sensor.Sensor;
import org.tesis.monitoringplatform.dto.sensor.SensorInfoDTO;
import reactor.core.publisher.Mono;

public interface SensorService {
    Mono<Sensor> processData(SensorInfoDTO sensorInfo);
}
