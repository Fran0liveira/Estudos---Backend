package com.ksoft.estudos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EstudosTest {
	
	@Test
	@DisplayName("Meu teste 1")
	public void test() {
		
		int i = 2;
		int j = 2;
		
		assertEquals(i + j, 2);
	}
	
	@Test
	@DisplayName("Meu teste 2")
	public void test2() {
		
		int i = 4;
		int j = 4;
		
		assertEquals(i + j, 80);
	}

}
