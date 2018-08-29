package com.gms.web.service;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.gms.web.domain.MemberDTO;
import com.gms.web.mapper.MemberMapper;
@ContextConfiguration("classpath:META-INF/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MainTest {
	@Autowired MemberDTO memberDTO;
	 @Configuration
	    @ComponentScan("com.gms.web")
	    static class Config {
	 
	    }
	 @Before
	    public void beforeTest() {
	        System.out.println("beforeTest: " + memberDTO);
	        memberDTO.setUserid("joon");
	    }
	@Test
	public void memberTest() {
		memberDTO.setUserid("joon");
		//MemberDTO r = memberDAO.selectOne(memberDTO);
		assertThat(memberDTO.getUserid(),
				is("joon"));
		System.out.println("----------");
	}
}
