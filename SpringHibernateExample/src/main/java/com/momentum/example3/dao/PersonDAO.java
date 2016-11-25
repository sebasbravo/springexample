package com.momentum.example3.dao;

import java.util.List;

import com.momentum.example3.model.Person;

public interface PersonDAO {
	
	void save(Person p);
	List<Person> list();

}
