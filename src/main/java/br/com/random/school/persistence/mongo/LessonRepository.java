package br.com.random.school.persistence.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.random.school.model.mongo.LessonDocument;

public interface LessonRepository extends MongoRepository<LessonDocument, String> {

}
