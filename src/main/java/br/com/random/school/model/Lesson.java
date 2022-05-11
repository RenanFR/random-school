package br.com.random.school.model;

import java.time.LocalDateTime;

public record Lesson(String id, LocalDateTime happenedAt, Class taughtClass) {
	
}
