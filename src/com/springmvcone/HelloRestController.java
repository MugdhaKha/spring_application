package com.springmvcone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String[] sayhello() {
		String[] topics = {"java","JSP","Spring"};
		return topics;
	}
}
