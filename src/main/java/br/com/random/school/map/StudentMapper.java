package br.com.random.school.map;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import br.com.random.school.entity.ClassEntity;
import br.com.random.school.entity.StudentEntity;
import br.com.random.school.model.Class;
import br.com.random.school.model.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {

	@Mapping(target = "classes", qualifiedByName = "toClassList")
	Student entityToRecord(StudentEntity student);

	@Named("toClass")
	@Mapping(target = "course.classes", ignore = true)
	@Mapping(target = "students", qualifiedByName = "toStudentWithoutClassesList")
	Class toClass(ClassEntity classEntity);

	@Named("toClassList")
	@IterableMapping(qualifiedByName = "toClass")
	List<Class> toClassList(List<ClassEntity> classEntityList);
	
	@Named("toStudentWithoutClasses")
	@Mapping(target = "classes", ignore = true)
	Student toStudentWithoutClasses(StudentEntity courseEntity);

	@Named("toStudentWithoutClassesList")
	@IterableMapping(qualifiedByName = "toStudentWithoutClasses")
	List<Student> toStudentWithoutClassesList(List<StudentEntity> entities);

}
