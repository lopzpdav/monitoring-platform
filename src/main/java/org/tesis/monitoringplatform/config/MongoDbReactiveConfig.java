package org.tesis.monitoringplatform.config;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;

@Configuration
@RequiredArgsConstructor
public class MongoDbReactiveConfig {
    private final ApplicationContext context;

    //Configuration to remove "_class" from being saved in mongo
    @PostConstruct
    public void init() {
        MappingMongoConverter mappingMongoConverter = context.getBean(MappingMongoConverter.class);
        mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
    }
}
