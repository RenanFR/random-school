package br.com.random.school.model;

import java.util.List;

public record Course(Long id, String title, List<Class> classes) {
	
}
