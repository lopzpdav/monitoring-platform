package org.tesis.monitoringplatform.dto.user;

import jakarta.validation.constraints.NotNull;

public record DataUserDTO(
        @NotNull(message = "Field must not be null") Double limit
) {
}
