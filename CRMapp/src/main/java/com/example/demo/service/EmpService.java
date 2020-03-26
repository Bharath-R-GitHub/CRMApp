package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Emp;

@Service
public class EmpService {
	private List<Emp> emps;

	public EmpService() {
		emps = new ArrayList<Emp>();
		emps.add(new Emp(1, "Bharath", "Trichy", "barathrju@gmail.com"));
		emps.add(new Emp(2, "Ramesh", "Chennai", "ramesh@gmail.com"));
		emps.add(new Emp(3, "Suresh", "Kerala", "suresh@gmail.com"));
	}

	public List<Emp> getEmployees() {
		return emps;
	}

	public Emp getEmployee(int eno) {
		Emp e1 = null;
		for (Emp e : emps) {
			if (e.getEno() == eno) {
				e1 = e;
			}
		}
		return e1;
	}
}
