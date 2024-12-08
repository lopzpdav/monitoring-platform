package org.tesis.monitoringplatform.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.tesis.monitoringplatform.domain.user.User;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
