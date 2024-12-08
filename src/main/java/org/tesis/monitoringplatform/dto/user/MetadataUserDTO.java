package org.tesis.monitoringplatform.dto.user;

import jakarta.validation.constraints.NotNull;

import java.time.Instant;

public record MetadataUserDTO(
        @NotNull(message = "Field must not be null") String userId,
        @NotNull(message = "Field must not be null") String firstName,
        @NotNull(message = "Field must not be null") String lastName,
        @NotNull(message = "Field must not be null") String email,
        @NotNull(message = "Field must not be null") String username,
        @NotNull(message = "Field must not be null") String gender,
        @NotNull(message = "Field must not be null") String phoneNumber,
        @NotNull(message = "Field must not be null") String address,
        @NotNull(message = "Field must not be null") Instant registrationDate
) {
}
