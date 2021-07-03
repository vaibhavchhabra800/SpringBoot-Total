package com.JunitEx.JunitExFirx;





import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;


class JunitExFizApplicationTests extends TestCase{
	
	
	JunitExFizApplication c = new JunitExFizApplication();
	
	@Test
	public void testParse() {
		System.out.println("Chala chala");
		assertEquals(5,c.add(2,3));
		
		
	}
	@Test
	public void testParse3() {
		System.out.println("Chala chala");
		assertEquals(5,c.add(2,3));
		
		
	}
	@Test
	public void testParse2() {
		System.out.println("Chala chala");
		assertEquals(5,c.add(2,3));
		
		
	}

}
