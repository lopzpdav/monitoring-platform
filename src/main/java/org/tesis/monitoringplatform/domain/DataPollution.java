package org.tesis.monitoringplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DataPollution implements Serializable {
    private Double pm25;
    private Double pm10;
    private Double co2;
    private Double so2;
    private Double temperature;
    private Double humidity;
}
