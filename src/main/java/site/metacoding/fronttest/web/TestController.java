package site.metacoding.fronttest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    
    @GetMapping("/")
	public String main(){
		return "/main/mainForm";
	}

	@GetMapping("/main/joinForm")
	public String join(){
		return "/main/joinForm";
	}

	@GetMapping("/main/loginForm")
	public String login(){
		return "/main/loginForm";
	}

	@GetMapping("/animalList")
	public String animal(){
		return "/animal/animalList";
	}

	@GetMapping("/shelterList")
	public String shelterList(){
		return "/animal/shelterList";
	}
}
