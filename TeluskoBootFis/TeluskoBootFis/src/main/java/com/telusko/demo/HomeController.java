package com.telusko.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController
{
	@RequestMapping("home")
	public String home(@RequestParam("name") String name)
	{
		// HttpSession session = req.getSession();
		//String name = req.getParameter("name");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name");
		mv.setViewName("home");
		System.out.println("hi"+name);
		//session.setAttribute("name", name);
		return "home";
	}
}

