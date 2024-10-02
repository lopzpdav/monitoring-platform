package org.tesis.monitoringplatform.service;

import org.tesis.monitoringplatform.domain.Pollution;
import org.tesis.monitoringplatform.dto.SensorInfoDTO;
import reactor.core.publisher.Mono;

public interface MonitoringService {
    Mono<Pollution> procesarInfo(SensorInfoDTO sensorInfo);
}
