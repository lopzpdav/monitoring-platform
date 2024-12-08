package org.tesis.monitoringplatform.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import org.tesis.monitoringplatform.domain.sensor.Sensor;

@Repository
public interface SensorRepository extends ReactiveMongoRepository<Sensor, String> {
}
