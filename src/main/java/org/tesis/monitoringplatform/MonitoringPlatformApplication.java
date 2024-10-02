package org.tesis.monitoringplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class MonitoringPlatformApplication {
	public static void main(String[] args) {
		SpringApplication.run(MonitoringPlatformApplication.class, args);
	}
}
