package org.tesis.monitoringplatform.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MetadataSensorDTO {
    @NotNull(message = "Field must not be null")
    private String sensor_id;

    @NotNull(message = "Field must not be null")
    private Map<String, Double> location;
}
