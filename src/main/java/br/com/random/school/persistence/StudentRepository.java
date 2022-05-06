package br.com.random.school.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.random.school.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
