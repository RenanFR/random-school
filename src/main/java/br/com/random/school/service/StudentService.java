package br.com.random.school.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.random.school.map.StudentMapper;
import br.com.random.school.model.Student;
import br.com.random.school.persistence.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
  	private StudentRepository repository;
	
	@Autowired
  	private StudentMapper mapper;
	
	public List<Student> listAll() {
		return repository.findAll()
				.stream()
				.map(mapper::entityToRecord)
				.collect(Collectors.toList());
		
	}

}
