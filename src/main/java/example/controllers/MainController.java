package example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @RequestMapping("/hello")
  @ResponseBody
  public String index() {
    return "Hello World !!!";
  }

}