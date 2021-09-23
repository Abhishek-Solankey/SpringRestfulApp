package com.spring.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	// URI versioning
	
	@GetMapping("v1/person")
	public PersonV1 personV1() {
		return new PersonV1(new Name("Bob"," Charlie"));
	}
	
	@GetMapping("v2/person")
	public PersonV2 personV2() {
		return new PersonV2("Bob Charlie");
	}
	
	// Request parameter versioning
	
	@GetMapping(value = "/person/param" , params = "version1")
	public PersonV1 param1() {
		return new PersonV1(new Name("Bob"," Charlie"));
	}
	
	@GetMapping(value = "/person/param" , params = "version2")
	public PersonV2 param2() {
		return new PersonV2("Bob Charlie");
	}
	
	//Header Versioning
	
	@GetMapping(value = "/person/header" , headers = "API-version=1")
	public PersonV1 headerV1() {
		return new PersonV1(new Name("Bob"," Charlie"));
	}
	
	@GetMapping(value = "/person/header" , headers = "API-version=2")
	public PersonV2 headerV2() {
		return new PersonV2("Bob Charlie");
	}
	
	// Accept header versioning or MIME type versioning or Media type versioning
	
	@GetMapping(value = "/person/produces" , produces = "application/vnd.company.app-v1+json" )
	public PersonV1 producesV1() {
		return new PersonV1(new Name("Bob"," Charlie"));
	}
	
	@GetMapping(value = "/person/produces" , produces = "application/vnd.company.app-v2+json")
	public PersonV2 producesV2() {
		return new PersonV2("Bob Charlie");
	}

}
