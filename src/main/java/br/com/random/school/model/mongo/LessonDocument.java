package br.com.random.school.model.mongo;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;

@Document(collection = "lessons")
@Builder
public class LessonDocument {
	
    @Id
    private String id;
    
    private LocalDateTime happenedAt;
    
    private Long classId;

}
