package org.tesis.monitoringplatform.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Map;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class MetadataPollution implements Serializable {
    private String sensor_id;
    private Map<String, Double> location;
    private String timestamp;
}