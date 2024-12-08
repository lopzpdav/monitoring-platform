package org.tesis.monitoringplatform.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.tesis.monitoringplatform.domain.user.User;
import org.tesis.monitoringplatform.domain.user.UserData;
import org.tesis.monitoringplatform.domain.user.UserMetadata;
import org.tesis.monitoringplatform.dto.user.UserInfoDTO;
import org.tesis.monitoringplatform.repository.UserRepository;
import org.tesis.monitoringplatform.service.UserService;
import reactor.core.publisher.Mono;

import java.time.Instant;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Mono<User> saveUser(UserInfoDTO userInfo) {
        UserMetadata userMetadata = new UserMetadata(
                userInfo.metadata().userId(),
                userInfo.metadata().firstName(),
                userInfo.metadata().lastName(),
                userInfo.metadata().email(),
                userInfo.metadata().username(),
                userInfo.metadata().gender(),
                userInfo.metadata().phoneNumber(),
                userInfo.metadata().address(),
                userInfo.metadata().registrationDate(),
                Instant.now()
        );

        UserData userData = new UserData(
                userInfo.data().limit()
        );

        User user = new User(null, userMetadata, userData);

        log.info("Document to save -> " + user);

        return userRepository.insert(user);
    }
}
