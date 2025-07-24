package com.example.demo.respsitiores;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Student;

@Repository
public interface Studrespo  extends JpaRepository<Student ,Integer>{

	List<Student> findByemailAndPassword(String email, String password);

}
