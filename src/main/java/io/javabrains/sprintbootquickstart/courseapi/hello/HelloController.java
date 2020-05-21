package io.javabrains.sprintbootquickstart.courseapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String sayHiToAll() {
		return " Welcome to Homepage ";
	}
	
	@RequestMapping("/hello")
	public String sayHi() {
		return " Good Morning to Everyone ";
	}

}
