package org.tesis.monitoringplatform.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import org.tesis.monitoringplatform.domain.Pollution;
import reactor.core.publisher.Mono;

@Repository
public interface PollutionRepository extends ReactiveMongoRepository<Object, String> {
    Mono<Void> save(Pollution pollution);
}
