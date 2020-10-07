package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PersonDAO;
import com.example.demo.entities.Person;

@RestController
public class MainController {

	@Autowired
	private PersonDAO personDAO;

	@ResponseBody
	@RequestMapping("/person")
	public Person person(@RequestParam(name = "method", required = true, defaultValue = "id") String method,
			@RequestParam(name = "value", required = true) String value) {
		Person person = null;
		switch (method) {
		case "id":
			person = personDAO.findIdInPerson(Long.parseLong(value)).get();
			break;
		case "id2":
			person = personDAO.findById(Long.parseLong(value)).get();
			break;

		default:
			System.out.println("not supported: " + method);
			break;
		}
		return person;
	}

	@ResponseBody
	@RequestMapping("/persons")
	public List<Person> persons(@RequestParam(name = "method", required = true, defaultValue = "all") String method,
			@RequestParam(name = "value", required = false) String value) {
		List<Person> all = null;
		switch (method) {
		case "all":
			all = (List<Person>) personDAO.findAll();
			break;
		case "name":
			all = (List<Person>) personDAO.findByFullNameLike(value);
			break;
		case "startS":
			all = (List<Person>) personDAO.findNameStartingByS();
			break;
		case "startWith":
			all = (List<Person>) personDAO.findByFullNameStartingWith(value);
			break;

		default:
			System.out.println("not supported: " + method);
			break;
		}

		return all;
	}

}