package org.tesis.monitoringplatform.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.tesis.monitoringplatform.domain.user.UserData;
import org.tesis.monitoringplatform.domain.user.UserMetadata;
import org.tesis.monitoringplatform.dto.user.DataUserDTO;
import org.tesis.monitoringplatform.dto.user.MetadataUserDTO;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.mapstruct.ReportingPolicy.ERROR;

@Mapper(componentModel = SPRING, unmappedTargetPolicy = ERROR)
public interface UserMapper {

    @Mapping(target = "timestamp", expression = "java(java.time.Instant.now())")
    UserMetadata metadataDtoToUserMetadata(MetadataUserDTO metadataUserDTO);

    UserData dataDtoToUserData(DataUserDTO dataUserDTO);
}
