package br.com.random.school.model;

import java.util.List;

public record Student(Long id, String name, List<Class> classes) {

}
