package org.tesis.monitoringplatform.service;

import org.tesis.monitoringplatform.dto.SensorInfoDTO;
import reactor.core.publisher.Mono;

public interface MonitoringService {
    Mono<Void> procesarInfo(SensorInfoDTO sensorInfo);
}
