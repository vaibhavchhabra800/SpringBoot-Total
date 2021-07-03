package comThymeleaf.Thymeleaf1Artifact_name.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.HttpMethod.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import comThymeleaf.Thymeleaf1Artifact_name.entity.Alien;

@Controller
public class MyController {
	
	@Autowired
	Alien repoAlien;
	
	@RequestMapping(value="/about" , method = RequestMethod.GET)
	public String about(Model model)
	{
		System.out.println("Hi Vaibhav");
		model.addAttribute("name","Aman");
		return "about";
	}
}
