package com.example.RESTCRUD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MVCCRUD.Student;

import jakarta.websocket.server.PathParam;

@RestController
public class Rest {
	
	StudentDAO stdao;
	
	
	
	@Autowired
	public Rest(StudentDAO stdao) {
		super();
		this.stdao = stdao;
	}



	@GetMapping("/all")
	public List<Student> getAll(){
		return stdao.findAll();
	}
	
	
	@PostMapping("/student")
	public void insert(@RequestBody Student s) {
		stdao.save(s);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		stdao.deleteById(id);
	}
	
	
	@PutMapping("/update")
	public void update(@RequestBody Student s) {
		stdao.save(s);
	}

}
