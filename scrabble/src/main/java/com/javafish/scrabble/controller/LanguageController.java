package com.javafish.scrabble.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Controller
public class LanguageController {
	
	@GetMapping("/setLanguage")
	public String setLanguage(@RequestParam(name="lang", required=false, defaultValue="en") String lang, HttpServletResponse response) {
		LocaleChangeInterceptor interseptor = new LocaleChangeInterceptor();
		interseptor.setParamName("lang");
		Cookie cookie = new Cookie("lang", lang);
		response.addCookie(cookie);
		return "start";
	}

}
