package org.mycompany.service;


import org.mycompany.pojos.PersonPojo;
import org.springframework.stereotype.Component;

@Component
public class ServicePojo {

	public PersonPojo getPojo() {
		return new PersonPojo(12, "firstName", "lastName");
	}
}
