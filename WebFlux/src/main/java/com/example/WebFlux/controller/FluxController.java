package com.example.WebFlux.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import reactor.core.publisher.Flux;

@RestController
public class FluxController {
	

	
	@GetMapping("/flux")
	public String getFlux() {
		return "flux";
	}
	
	//@RequestMapping(method = RequestMethod.GET, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
		@GetMapping(value="/fluxDetails",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
		public Flux<Department>getDetails(){
			System.out.println("for testing");
			return null;
			//List<Department ob>=   service.findAll();
	
		}
}
