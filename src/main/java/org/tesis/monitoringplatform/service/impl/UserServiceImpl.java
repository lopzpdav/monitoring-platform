package org.tesis.monitoringplatform.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.tesis.monitoringplatform.domain.user.User;
import org.tesis.monitoringplatform.dto.user.UserInfoDTO;
import org.tesis.monitoringplatform.mappers.UserMapper;
import org.tesis.monitoringplatform.repository.UserRepository;
import org.tesis.monitoringplatform.service.UserService;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public Mono<UserInfoDTO> saveUser(UserInfoDTO userInfo) {
        return userRepository.insert(new User(
                null,
                userMapper.metadataDtoToUserMetadata(userInfo.metadata()),
                userMapper.dataDtoToUserData(userInfo.data())))
                .thenReturn(userInfo);
    }
}
