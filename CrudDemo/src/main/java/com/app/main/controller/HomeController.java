package com.app.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.main.model.Employee;
import com.app.main.serviceI.ServiceI;
//@CrossOrigin("**")
@RestController
public class HomeController {

	@Autowired
	ServiceI ser;
	
	
	@PostMapping("/insert")
	public String addData(@RequestBody Employee e)
	{
		ser.addData(e);
		return "Employee Successfully Register...";
	}
	
	@GetMapping("/get")
	public Iterable<Employee> getData()
	{
		Iterable<Employee> list= ser.getData();
		return list;
	}
	
	@PutMapping("/update/{id}")
	public String updateData(@RequestBody Employee e)
	{
		ser.addData(e);
		return "data updated Successfully...";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id)
	{
		ser.deletedata(id);
		return "Data deleted Successfully....";
	}
	
	@GetMapping("/get/{name}")
	public Employee getByName(@PathVariable String name)
	{
		Employee e=ser.getByName(name);
		return e;
	}
}
