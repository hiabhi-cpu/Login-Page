package com.telusko.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.model.Alien;
import com.telusko.demo.repo.AlienRepo;

@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String loginPage() {
		return "login.jsp";
	}
	
	@RequestMapping("login")
	public ModelAndView login(Alien alien) {
		System.out.println(alien);
		ModelAndView mv=new ModelAndView();
		if(alien.getemail().isBlank() || alien.getPassword().isBlank()) {
			System.out.println("Enter correct data");
			mv.addObject("obj", "Empty field");
			mv.setViewName("/");
		}
		else if(isExistDb(alien)) {
			System.out.println("Logged in");
			mv.addObject("obj", "Logged in");
			mv.setViewName("/home");
			
		}
		else {
			System.out.println("Incorrect entry");
			mv.addObject("obj", "Incorrect data");
			mv.setViewName("/");
		}
		
		
		
		return mv;
	}
	
	boolean isExistDb(Alien air) {
		for(Alien a:repo.findAll()) {
			if(a.getemail().equals(air.getemail())) {
				if(a.getPassword().equals(air.getPassword())) {
					return true;
				}
			}
		}
		return false;
	}
	
	@RequestMapping("logup")
	public String logup() {
		System.out.println("Clicked logup");
		return "logup.jsp";
	}
	
	@RequestMapping("signupnew")
	public ModelAndView signupnew(Alien alien) {
		ModelAndView mv=new ModelAndView();
		System.out.println();
		if(alien.getemail().isBlank() || alien.getPassword().isBlank()) {
			System.out.println("Enter correct data");
			mv.addObject("obj", "Enter correct data");
			mv.setViewName("/logup");
		}
		else if(repo.existsById(alien.getemail())) {
			System.out.println("Exist in the database");
			mv.addObject("obj", "User Already Exist");
			mv.setViewName("/logup");
		}
		else {
			System.out.println("Saved in the database");
			repo.save(alien);
			mv.addObject("obj", "");
			mv.setViewName("/");
		}
		return mv;
	}
	
	
	@RequestMapping("home")
	public String home() {
		System.out.println("Home");
		return "home.jsp";
	}
}
