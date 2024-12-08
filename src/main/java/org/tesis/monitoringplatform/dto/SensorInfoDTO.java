package org.tesis.monitoringplatform.dto;

public record SensorInfoDTO(
        MetadataSensorDTO metadata,
        DataSensorDTO data
) {
}
