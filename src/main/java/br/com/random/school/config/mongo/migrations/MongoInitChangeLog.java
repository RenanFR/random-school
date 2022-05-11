package br.com.random.school.config.mongo.migrations;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

import br.com.random.school.model.mongo.LessonDocument;
import br.com.random.school.persistence.mongo.LessonRepository;
import br.com.random.school.service.StudentService;

@ChangeLog(order = "001")
public class MongoInitChangeLog {
	
	@Autowired
  	private StudentService studentService;

	@ChangeSet(order = "001", id = "insert_test_lessons", author = "Renan Rodrigues")
	public void insertTestLessons(LessonRepository lessonRepository) {
		lessonRepository.save(LessonDocument.builder().classId(studentService.getLatestOpenedClass().id()).build());
	}

}
