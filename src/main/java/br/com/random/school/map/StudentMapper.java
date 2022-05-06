package br.com.random.school.map;

import org.mapstruct.Mapper;

import br.com.random.school.entity.StudentEntity;
import br.com.random.school.model.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {
	
	Student entityToRecord(StudentEntity student);

}
