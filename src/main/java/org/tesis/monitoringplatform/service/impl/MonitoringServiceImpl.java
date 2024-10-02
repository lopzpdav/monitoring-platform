package org.tesis.monitoringplatform.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.tesis.monitoringplatform.domain.DataPollution;
import org.tesis.monitoringplatform.domain.MetadataPollution;
import org.tesis.monitoringplatform.domain.Pollution;
import org.tesis.monitoringplatform.dto.SensorInfoDTO;
import org.tesis.monitoringplatform.repository.PollutionRepository;
import org.tesis.monitoringplatform.service.MonitoringService;
import reactor.core.publisher.Mono;

import java.util.Date;

@Slf4j
@RequiredArgsConstructor
@Service
public class MonitoringServiceImpl implements MonitoringService {
    private final PollutionRepository pollutionRepository;

    @Override
    public Mono<Pollution> procesarInfo(SensorInfoDTO sensorInfo) {
        MetadataPollution metadataPollution = MetadataPollution.builder()
                .sensor_id(sensorInfo.getMetadata().getSensor_id())
                .location(sensorInfo.getMetadata().getLocation())
                .timestamp(String.valueOf(new Date()))
                .build();

        DataPollution dataPollution = DataPollution.builder()
                .pm25(sensorInfo.getData().getPm25())
                .pm10(sensorInfo.getData().getPm10())
                .co2(sensorInfo.getData().getCo2())
                .so2(sensorInfo.getData().getSo2())
                .temperature(sensorInfo.getData().getTemperature())
                .humidity(sensorInfo.getData().getHumidity())
                .build();

        Pollution pollution = Pollution.builder()
                .metadata(metadataPollution)
                .data(dataPollution)
                .build();

        log.info("Document to save -> " + pollution);

        return pollutionRepository.insert(pollution);
    }
}
