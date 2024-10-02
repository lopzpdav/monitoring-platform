package org.tesis.monitoringplatform.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DataSensorDTO {
    @NotNull(message = "Field must not be null")
    private Double pm25;

    @NotNull(message = "Field must not be null")
    private Double pm10;

    @NotNull(message = "Field must not be null")
    private Double co2;

    @NotNull(message = "Field must not be null")
    private Double so2;

    @NotNull(message = "Field must not be null")
    private Double temperature;

    @NotNull(message = "Field must not be null")
    private Double humidity;
}
