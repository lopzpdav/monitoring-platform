package org.tesis.monitoringplatform.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import org.tesis.monitoringplatform.domain.Pollution;

@Repository
public interface PollutionRepository extends ReactiveMongoRepository<Pollution, String> {
}
