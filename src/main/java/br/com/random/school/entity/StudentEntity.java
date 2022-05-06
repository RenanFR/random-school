package br.com.random.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name="student")
@Getter
public class StudentEntity {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
    @Column
    private String name;

}
