package br.com.random.school.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.random.school.entity.ClassEntity;

public interface ClassRepository extends JpaRepository<ClassEntity, Long> {

}
