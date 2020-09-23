package com.javafish.scrabble.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StartController {

	@GetMapping("/start")
	public String greeting(@RequestParam(name="lang", required=false, defaultValue="en") String lang, Model model) {
		
		model.addAttribute("lang", lang);
		return "start";
	}

}
