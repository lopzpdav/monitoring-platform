package org.tesis.monitoringplatform.domain;

import lombok.*;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class DataPollution implements Serializable {
    private Double pm25;
    private Double pm10;
    private Double co2;
    private Double so2;
    private Double temperature;
    private Double humidity;
}
