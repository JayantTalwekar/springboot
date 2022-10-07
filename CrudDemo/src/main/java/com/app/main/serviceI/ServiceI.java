package com.app.main.serviceI;

import com.app.main.model.Employee;

public interface ServiceI {

	void addData(Employee e);

	Iterable<Employee> getData();

	void deletedata(int id);

	Employee getByName(String name);

}
