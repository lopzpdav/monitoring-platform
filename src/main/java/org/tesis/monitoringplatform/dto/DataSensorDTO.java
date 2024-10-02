package org.tesis.monitoringplatform.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DataSensorDTO {
    private Double pm25;
    private Double pm10;
    private Double co2;
    private Double so2;
    private Double temperature;
    private Double humidity;
}
