package br.com.random.school.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name="class")
@Getter
public class ClassEntity {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
    @ManyToOne
    @JoinColumn(name="course_id", nullable=false)
    private CourseEntity course;
 
    @ManyToMany
    @JoinTable(
    		  name = "student_class", 
    		  joinColumns = @JoinColumn(name = "student_id"), 
    		  inverseJoinColumns = @JoinColumn(name = "class_id"))
    private List<StudentEntity> students;
    
}
