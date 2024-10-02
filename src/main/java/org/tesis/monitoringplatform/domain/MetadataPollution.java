package org.tesis.monitoringplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MetadataPollution implements Serializable {
    private String sensor_id;
    private Map<String, Double> location;
    private String timestamp;
}