package netgloo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	private String test;

	@RequestMapping("/hello")
	@ResponseBody
	public String index() {
		String test = "Hello World !!!";
		return test;
	}

}
