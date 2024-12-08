package org.tesis.monitoringplatform.service;

import org.tesis.monitoringplatform.dto.user.UserInfoDTO;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<UserInfoDTO> saveUser(UserInfoDTO userInfo);
}
