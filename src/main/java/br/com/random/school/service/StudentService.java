package br.com.random.school.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.random.school.entity.ClassEntity;
import br.com.random.school.entity.StudentEntity;
import br.com.random.school.map.StudentMapper;
import br.com.random.school.model.Student;
import br.com.random.school.persistence.ClassRepository;
import br.com.random.school.persistence.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
  	private StudentRepository repository;
	
	@Autowired
	private ClassRepository classRepository;
	
	@Autowired
  	private StudentMapper mapper;
	
	public List<Student> listAll() {
		List<StudentEntity> entities = repository.findAll();
		return entities
				.stream()
				.map(mapper::entityToRecord)
				.collect(Collectors.toList());
		
	}
	
	public Student findById(Long id) {
		StudentEntity student = repository.findById(id).get();
		return mapper.entityToRecord(student);
		
	}
	
	public br.com.random.school.model.Class getLatestOpenedClass() {
		List<ClassEntity> allClasses = classRepository.findAll();
		ClassEntity latestOpenedClass = allClasses.stream().sorted((aClass, otherClass) -> aClass.getOpenedAt().compareTo(otherClass.getOpenedAt())).findFirst().get();
		return mapper.toClass(latestOpenedClass);

	}

}
