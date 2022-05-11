package br.com.random.school.config.mongo;

import java.util.Collection;
import java.util.Collections;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

	@Override
	protected String getDatabaseName() {
		return "random-school";
	}

	@Override
	public MongoClient mongoClient() {
		ConnectionString connectionString = new ConnectionString("mongodb://root:root@localhost:27017/?authSource=admin&readPreference=primary&ssl=false&directConnection=true");
		MongoClientSettings mongoClientSettings = MongoClientSettings.builder().applyConnectionString(connectionString)
				.build();

		return MongoClients.create(mongoClientSettings);
	}

	@Override
	public Collection<String> getMappingBasePackages() {
		return Collections.singleton("br.com.random.school.model.mongo");
	}

}
