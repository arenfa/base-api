package base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import base.service.GreetingService;

@Service("greetingService")
public class GreetingServiceImpl implements GreetingService {

	@Autowired
	List<GreetingService> greetingServices;
	
	@Override
	public String hello() {
		greetingServices.forEach(greetingService -> {
			System.out.println(greetingService.getClass().getName());
		});
		return "hello from service";
	}

}
