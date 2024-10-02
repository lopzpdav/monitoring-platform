package org.tesis.monitoringplatform.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Document(collection = "pollution")
@TypeAlias("pollution")
public class Pollution {
    @Id
    private String id;
    private MetadataPollution metadata;
    private DataPollution data;
}
