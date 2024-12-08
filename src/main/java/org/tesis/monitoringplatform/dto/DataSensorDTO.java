package org.tesis.monitoringplatform.dto;

import jakarta.validation.constraints.NotNull;

public record DataSensorDTO(
        @NotNull(message = "Field must not be null") Double value
) {
}
