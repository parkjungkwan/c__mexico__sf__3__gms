package com.gms.web.exam;

import static org.junit.Assert.*;

import org.junit.Test;

public class MariadbConnTest {

	@Test
	public void testExam() {
		MariadbConn m = new MariadbConn();
		assertEquals("김준",m.exam());
	}

}
