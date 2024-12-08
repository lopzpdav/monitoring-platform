package org.tesis.monitoringplatform.domain.user;

import java.io.Serializable;

public record UserData(
        Double limit
) implements Serializable {
}
