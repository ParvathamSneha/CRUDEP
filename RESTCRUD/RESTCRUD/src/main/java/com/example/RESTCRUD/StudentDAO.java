package com.example.RESTCRUD;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MVCCRUD.Student;

public interface StudentDAO extends JpaRepository<Student, Integer>{
	

}
