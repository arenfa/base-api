package base.service.aws;

import org.springframework.stereotype.Service;

import base.service.GreetingService;

@Service("awsGreetingService")
public class AwsGreetingServiceImpl implements GreetingService {

	@Override
	public String hello() {
		return "hello from AwsGreetingServiceImpl";
	}

}
