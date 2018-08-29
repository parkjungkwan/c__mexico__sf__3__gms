package com.gms.web.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.gms.web.domain.MemberDTO;
import com.gms.web.mapper.MemberMapper;
import com.gms.web.service.MemberService; 
@ContextConfiguration("classpath:META-INF/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class MemberServiceImplTest {
	@Autowired MemberDTO memberDTO;
	@Autowired MemberMapper memberDAO;
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
	}

}
