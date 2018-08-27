package com.gms.web.mapper;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.gms.web.domain.MemberDTO;

public class MemberMapperTest {

	public void testInsert() {
		fail("Not yet implemented");
	}

	public void testSelectList() {
		fail("Not yet implemented");
	}

	public void testSelectSome() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectOne() {
		MemberMapper m = new MemberMapper();
		Map<String,String> p = new HashMap<>();
		p.put("userid", "joon");
		MemberDTO d = m.selectOne(p);
		assertEquals("김준",d.getName());
	}

	public void testCount() {
		fail("Not yet implemented");
	}

	public void testUpdate() {
		fail("Not yet implemented");
	}

	public void testDelete() {
		fail("Not yet implemented");
	}

	public void testLogin() {
		fail("Not yet implemented");
	}

}
