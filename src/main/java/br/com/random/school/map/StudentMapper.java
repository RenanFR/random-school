package br.com.random.school.map;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.random.school.entity.StudentEntity;
import br.com.random.school.model.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {
	
	@Mapping(target="name", source="name")
	Student entityToRecord(StudentEntity student);

}
