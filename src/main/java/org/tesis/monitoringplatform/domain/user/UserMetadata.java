package org.tesis.monitoringplatform.domain.user;

import java.io.Serializable;
import java.time.Instant;

public record UserMetadata(
        String userId,
        String firstName,
        String lastName,
        String email,
        String username,
        String gender,
        String phoneNumber,
        String address,
        Instant registrationDate,
        Instant timestamp
) implements Serializable {
}
