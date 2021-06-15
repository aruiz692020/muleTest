package org.mycompany.controllers;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class controller1 {

	@Autowired
	ProducerTemplate producerTemplate;
	
	@GetMapping("/greeting")
	public String greeting(){
		String msg = producerTemplate.requestBody("direct:hello","", String.class);
		return msg;
	}
	
}
