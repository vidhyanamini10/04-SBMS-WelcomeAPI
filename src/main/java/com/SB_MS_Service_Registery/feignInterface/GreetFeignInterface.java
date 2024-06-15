package com.SB_MS_Service_Registery.feignInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="03-SB-MS-GREET-API")
public interface GreetFeignInterface {
	
	@GetMapping("/greet")
	public String invokeGreetApi();
	

}
