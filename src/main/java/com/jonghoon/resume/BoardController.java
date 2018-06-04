package com.jonghoon.resume;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping("/board")
	public String list() {
		return "board";
	}
	
	@RequestMapping("/new")
	public String writeForm() {
		
		return "new"; 
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest req, Model model) {
		
		return "write"; 
	}
}
