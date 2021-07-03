package controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AlienController
{
	//@Autowired
	//AlienRepo repo;

	@RequestMapping(value="/home")
	public String home(Model model) 
	{
		
		return "home";
	}
	
	
}
