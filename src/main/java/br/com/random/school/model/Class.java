package br.com.random.school.model;

import java.util.List;

public record Class(Long id, Course course, List<Student> students) {

}
