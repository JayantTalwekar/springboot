package com.app.main.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.main.model.Employee;
import com.app.main.repository.RepositoryI;
import com.app.main.serviceI.ServiceI;
@Service
public class HomeService implements ServiceI {

	@Autowired
	RepositoryI repo;

	@Override
	public void addData(Employee e) {
		repo.save(e);
		
	}

	@Override
	public Iterable<Employee> getData() {
		
		return repo.findAll();
	}

	@Override
	public void deletedata(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public Employee getByName(String name) {
		
		return repo.findByName(name);
	}
}
