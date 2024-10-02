package org.tesis.monitoringplatform.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MetadataSensorDTO {
    private String sensor_id;
    private Map<String, Double> location;
}
