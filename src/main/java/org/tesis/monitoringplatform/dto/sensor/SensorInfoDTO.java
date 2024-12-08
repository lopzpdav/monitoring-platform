package org.tesis.monitoringplatform.dto.sensor;

public record SensorInfoDTO(
        MetadataSensorDTO metadata,
        DataSensorDTO data
) {
}
