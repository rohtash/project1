package com.tesco.swagger.data;

import java.util.ArrayList;
import java.util.List;

import com.tesco.swagger.model.Category;
import com.tesco.swagger.model.Person;
import com.tesco.swagger.model.Pet;

public class PersonData {
	static List<Person> persons = new ArrayList<Person>();
	static List<Category> categories = new ArrayList<Category>();
	
	static{
	categories.add(createCategory(1, "chill"));
	categories.add(createCategory(2, "emotional"));
	categories.add(createCategory(3, "mast"));
	categories.add(createCategory(4, "cartoon"));
	persons.add(new Person("rkp","rohtash","poonia"));
	persons.add(new Person("lkp@gmail.com","lalchand","poonia"));
	persons.add(new Person("grp@gmail.com","ggg","poonia"));
	persons.add(new Person("skp@gmail.com","subhash","poonia"));
	persons.add(new Person("vkp@gmail.com","vinod","poonia"));
	}
	
	
	
	public Person getPersonbyEmailId(String emailId) {
		for (Person person : persons) {
			if (person.getEmailId().equals(emailId)) {
				return person;
				
			}
		}
		return null;
	}
	public Person getPersonbyFname(String firstName) {
		for (Person person : persons) {
			if (person.getFirstName().equals(firstName)) {
				return person;
				
			}
		}
		return null;
	}
	public Person getPersonbyLname(String lastName) {
		for (Person person : persons) {
			if (person.getLastName().equals(lastName)) {
				return person;
				
			}
		}
		return null;
	}
	
	public void addPerson(Person person) {
		if (persons.size() > 0) {
			for (int i = persons.size() - 1; i >= 0; i--) {
				if (persons.get(i).getEmailId()== person.getEmailId()) {
					persons.remove(i);
				}
			}
		}
		persons.add(person);
	}
	
	
	
	static Category createCategory(long id, String name) {
		Category category = new Category();
		category.setId(id);
		category.setName(name);
		return category;
	}
}
