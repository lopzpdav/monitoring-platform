package org.tesis.monitoringplatform.domain.sensor;

import java.io.Serializable;

public record SensorData(
        Double value
) implements Serializable {
}
