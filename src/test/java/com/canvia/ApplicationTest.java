package com.canvia;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class ApplicationTest {

	@Test
	public void contextLoads() {
		
		String obj1="Junit";
		String obj2="Junit";
		assertEquals(obj1, obj2);;
	}

}