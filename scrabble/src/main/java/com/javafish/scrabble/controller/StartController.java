package com.javafish.scrabble.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StartController {

	@GetMapping("/start")
	public String greeting(@RequestParam(name="lang", required=false, defaultValue="en") String lang, Model model) {
		
		model.addAttribute("lang", lang);
		return "start";
	}
	
	@RequestMapping(value="/newGame",params="startNewGame",method=RequestMethod.POST)
    public void startNewGame()
    {
        System.out.println("startNewGame block called");
    }
	
	@RequestMapping(value="/joinGame",params="joinExistGame",method=RequestMethod.POST)
    public void joinExistGame()
    {
        System.out.println("joinExistGame block called");
    }
	
	

}
