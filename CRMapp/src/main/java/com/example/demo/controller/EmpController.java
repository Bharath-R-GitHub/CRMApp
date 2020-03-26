package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Emp;
import com.example.demo.service.EmpService;

@Controller
public class EmpController {
	EmpService service;

	@Autowired
	public EmpController(EmpService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String showHome(Model model) {
		List<Emp> emps = service.getEmployees();
		model.addAttribute("employees", emps);
		return "index";
	}

	@GetMapping("/edit")
	public String showForm(@RequestParam("eno") int eno, Model model) {
		Emp e = service.getEmployee(eno);
		model.addAttribute(e);
		return "emp-form";
	}
}
