package com.gms.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("context")
public class HomeController {
	static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession session, HttpServletRequest request) {
		String context = request.getContextPath();
		logger.info("\n --------- Welcome {} !! ----------","Home");
		session.setAttribute("context", context );
		return "public:common/content.tiles";
	}
	@RequestMapping("/move/{prefix}/{dir}/{page}")
	public String move(
			@PathVariable String prefix,
			@PathVariable String dir,
			@PathVariable String page) {
		logger.info("\n --------- HomeController {} !!--------","move()");
		String path = prefix+":"+dir+"/"+page+".tiles";
		logger.info("\n move page >>> {}",path);
		
		return path;
	}
	
}









