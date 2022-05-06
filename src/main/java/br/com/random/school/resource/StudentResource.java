package br.com.random.school.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.random.school.model.Student;
import br.com.random.school.service.StudentService;

@RestController
@RequestMapping("students")
public class StudentResource {
	
	@Autowired
  	private StudentService service;
	
    @GetMapping(produces = "application/json")
    public List<Student> listAll() {
        return service.listAll();
    }
    
    @GetMapping("/{studentId}")
    public Student findById(@PathVariable("studentId") Long id) {
    	return service.findById(id);
    }

}
