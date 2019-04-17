package io.javabrains.springbootstarter.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.TopicService;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
	}

}
