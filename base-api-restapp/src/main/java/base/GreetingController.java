package base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import base.service.GreetingService;

@RestController
public class GreetingController {

	
	@Autowired
	@Qualifier("greetingService")
	private GreetingService greetingService;
	
	@GetMapping
	String hello() {
		return greetingService.hello();
	}
}
