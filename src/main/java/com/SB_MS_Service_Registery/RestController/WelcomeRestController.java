package com.SB_MS_Service_Registery.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SB_MS_Service_Registery.feignInterface.GreetFeignInterface;

@RestController
public class WelcomeRestController {
	
	@Autowired
	public GreetFeignInterface greetFeignInterface;
	@Autowired
	public Environment env;
	
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String greetApi = greetFeignInterface.invokeGreetApi();
		String welcomemsg = "Welcome to Feign client communication";
		
		String property = env.getProperty("server.port");
		
		
		
		
		return greetApi + " ::  "+ welcomemsg +"::::" +property ;
		
	}

}
