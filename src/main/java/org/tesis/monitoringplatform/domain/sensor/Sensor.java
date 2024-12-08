package org.tesis.monitoringplatform.domain.sensor;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sensor")
@TypeAlias("sensor")
public record Sensor(
        @Id String id,
        SensorMetadata metadata,
        SensorData data
) {}
