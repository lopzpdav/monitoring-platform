package org.tesis.monitoringplatform.controllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.tesis.monitoringplatform.domain.user.User;
import org.tesis.monitoringplatform.dto.user.UserInfoDTO;
import org.tesis.monitoringplatform.service.UserService;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/data")
    @Operation(summary = "Save user's data", description = "Endpoint to save users")
    @ResponseStatus(HttpStatus.OK)
    public Mono<UserInfoDTO> saveSensorData (@Validated @RequestBody UserInfoDTO request){
        return userService.saveUser(request)
                .thenReturn(request);
    }
}
