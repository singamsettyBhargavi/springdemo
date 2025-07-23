package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entites.Student;
import com.example.demo.respsitiores.Studrespo;

@Controller
public class Studentcontroller {
	@Autowired
	Studrespo s;
	@GetMapping("open")
public String openpage() {
	return "studata";
	
}

	
@PostMapping("/stureg")	
public String regsteruser(@ModelAttribute Student stu, Model m) {  
	Student stus= s.save(stu);
if(stus !=null) {
	m.addAttribute("success", "suc");
	return "redirect:/stulog"; 
}
else
{
	m.addAttribute("failure", "f");
}
	return "login";
}

@GetMapping("/stulog")
public String loguser() {
	return "";
	
}
}

