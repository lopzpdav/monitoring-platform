package org.tesis.monitoringplatform.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.tesis.monitoringplatform.domain.sensor.Sensor;
import org.tesis.monitoringplatform.domain.sensor.SensorData;
import org.tesis.monitoringplatform.domain.sensor.SensorMetadata;
import org.tesis.monitoringplatform.dto.sensor.SensorInfoDTO;
import org.tesis.monitoringplatform.repository.SensorRepository;
import org.tesis.monitoringplatform.service.SensorService;
import reactor.core.publisher.Mono;

import java.time.Instant;

@Slf4j
@RequiredArgsConstructor
@Service
public class SensorServiceImpl implements SensorService {
    private final SensorRepository sensorRepository;

    @Override
    public Mono<Sensor> processData(SensorInfoDTO sensorInfo) {
        SensorMetadata sensorMetadata = new SensorMetadata(
                sensorInfo.metadata().sensorDataType(),
                sensorInfo.metadata().location(),
                Instant.now()
        );

        SensorData sensorData = new SensorData(
                sensorInfo.data().value()
        );

        Sensor sensor = new Sensor(null, sensorMetadata, sensorData);

        log.info("Document to save -> " + sensor);

        return sensorRepository.insert(sensor);
    }
}
