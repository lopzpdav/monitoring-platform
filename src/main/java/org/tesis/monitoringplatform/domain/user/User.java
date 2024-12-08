package org.tesis.monitoringplatform.domain.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@TypeAlias("user")
public record User(
        @Id String id,
        UserMetadata metadata,
        UserData data
) {
}
