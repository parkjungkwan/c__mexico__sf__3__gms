package com.gms.web.exam;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gms.web.domain.MemberDTO;
import com.gms.web.mapper.MemberMapper;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.text.IsEmptyString.*;
@ContextConfiguration("classpath:META-INF/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {
	@Autowired MemberDTO memberDTO;
	@Autowired MemberMapper memberDAO;
	@Test
    public void isStringEmpty() {
	/*	List<Integer> list = Arrays.asList(5, 2, 4);
		assertThat(list, hasSize(3));
		assertThat(list, contains(5, 2, 4));*/
		/*assertThat("joon",
				equalTo("joon"));*/
       /* String stringToTest = "";
        assertThat(stringToTest, isEmptyString());*/
		memberDTO.setUserid("joon");
		MemberDTO r = memberDAO.selectOne(memberDTO);
		assertThat(r.getUserid(),
				is("김준"));
    }
}
