package model.service;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartamentService {

	public List<Department> findAll() {
		List<Department> list = new ArrayList<>();
		list.add (new  Department(1, "books"));
		list.add (new  Department(2, "computador"));
		list.add (new  Department(3, "eletronicos"));
		return list;
	}
	
	
}
