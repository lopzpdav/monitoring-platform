package org.tesis.monitoringplatform.dto.sensor;

import jakarta.validation.constraints.NotNull;
import org.tesis.monitoringplatform.enums.SensorDataType;

import java.util.Map;

public record MetadataSensorDTO(
        @NotNull(message = "Field must not be null") SensorDataType sensorDataType,
        @NotNull(message = "Field must not be null") Map<String, Double> location
) {
}
