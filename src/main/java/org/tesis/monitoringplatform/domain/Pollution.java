package org.tesis.monitoringplatform.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "pollution")
public class Pollution {
    @Id
    private String id;
    private MetadataPollution metadata;
    private DataPollution data;
}
