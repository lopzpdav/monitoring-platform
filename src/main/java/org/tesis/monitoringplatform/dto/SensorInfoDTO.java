package org.tesis.monitoringplatform.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SensorInfoDTO {
    private MetadataSensorDTO metadata;
    private DataSensorDTO data;
}
