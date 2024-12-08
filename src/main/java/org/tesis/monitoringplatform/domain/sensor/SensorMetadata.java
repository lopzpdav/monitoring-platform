package org.tesis.monitoringplatform.domain.sensor;

import org.tesis.monitoringplatform.enums.SensorDataType;

import java.io.Serializable;
import java.time.Instant;
import java.util.Map;

public record SensorMetadata(
        SensorDataType sensorDataType,
        Map<String, Double> location,
        Instant timestamp
) implements Serializable {
}