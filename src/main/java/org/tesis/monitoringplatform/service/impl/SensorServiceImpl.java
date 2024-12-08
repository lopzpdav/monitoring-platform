package org.tesis.monitoringplatform.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.tesis.monitoringplatform.domain.sensor.Sensor;
import org.tesis.monitoringplatform.dto.sensor.SensorInfoDTO;
import org.tesis.monitoringplatform.mappers.SensorMapper;
import org.tesis.monitoringplatform.repository.SensorRepository;
import org.tesis.monitoringplatform.service.SensorService;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@Service
public class SensorServiceImpl implements SensorService {
    private final SensorRepository sensorRepository;
    private final SensorMapper sensorMapper;

    @Override
    public Mono<SensorInfoDTO> processData(SensorInfoDTO sensorInfo) {
        return sensorRepository.insert(new Sensor(
                null,
                sensorMapper.metadataDtoToSensorMetadata(sensorInfo.metadata()),
                sensorMapper.dataDtoToSensorData(sensorInfo.data())))
                .thenReturn(sensorInfo);
    }
}
