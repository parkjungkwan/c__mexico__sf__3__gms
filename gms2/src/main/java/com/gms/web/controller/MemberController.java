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
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/member")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member;
	@Autowired MemberService memberService;
	@RequestMapping("/add")
	public void add() {}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	@RequestMapping("/retrieve")
	public void retrieve() {}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping("/modify")
	public void modify() {}
	@RequestMapping("/remove")
	public void remove() {}
	@RequestMapping("/login")
	public String login() {
		logger.info("\n --------- MemberController {} !!--------","login()");
		Map<String,String> p = new HashMap<>();
		p.put("userid", "joon");
		MemberDTO m = memberService.retrieve(p);
		System.out.println("----------------");
		System.out.println(m.getName());
		System.out.println("----------------");
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
