package org.tesis.monitoringplatform.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.tesis.monitoringplatform.domain.sensor.SensorData;
import org.tesis.monitoringplatform.domain.sensor.SensorMetadata;
import org.tesis.monitoringplatform.dto.sensor.DataSensorDTO;
import org.tesis.monitoringplatform.dto.sensor.MetadataSensorDTO;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.mapstruct.ReportingPolicy.ERROR;

@Mapper(componentModel = SPRING, unmappedTargetPolicy = ERROR)
public interface SensorMapper {

    @Mapping(target = "timestamp", expression = "java(java.time.Instant.now())")
    SensorMetadata metadataDtoToSensorMetadata(MetadataSensorDTO metadataSensorDTO);

    SensorData dataDtoToSensorData(DataSensorDTO dataSensorDTO);
}
