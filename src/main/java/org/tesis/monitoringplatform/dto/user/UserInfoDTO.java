package org.tesis.monitoringplatform.dto.user;

public record UserInfoDTO(
        MetadataUserDTO metadata,
        DataUserDTO data
) {
}
