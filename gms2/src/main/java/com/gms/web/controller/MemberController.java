package com.gms.web.controller;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import com.gms.web.domain.*;
import com.gms.web.service.MemberService;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/member")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member;
	@Autowired MemberService memberService;
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void add(
			Model model,
			@ModelAttribute MemberDTO member) {
		logger.info("\n MEMBER__ADD's PARAM is {} !!--------",member.toString());
		System.out.println("name is "+member.getName());
	}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	@RequestMapping("/retrieve")
	public void retrieve(
			@ModelAttribute MemberDTO member,
			Model model) {
		
	}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping("/modify")
	public void modify() {}
	@RequestMapping("/remove")
	public void remove() {}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(
			@ModelAttribute MemberDTO member,
			Model model) {
		logger.info("\n LOGIN__PARAM is {}",member.toString());
		MemberDTO user = memberService.retrieve(member);
		model.addAttribute("user", user);
		logger.info("\n LOGIN__RESULT is {}",model.toString());
		return "login__success";
	}
	@RequestMapping("/logout")
	public String logout() {
		logger.info("\n --------- MemberController {} !!--------","logout()");
		return "redirect:/";
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
