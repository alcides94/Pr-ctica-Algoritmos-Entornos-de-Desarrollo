package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import util.Algoritmos;

class verificacionFunciones {
	

	
	@Test
	void testFibonacci() {
		int fiboEsperada=5;
		int fiboObtenida=Algoritmos.fibonacci(5);
		assertEquals(fiboEsperada, fiboObtenida);	
	}
	
	@Test
	void testFactorial() {
		int factEsperada=720;
		int factObtenida=Algoritmos.factorial(6);
		assertEquals(factEsperada, factObtenida);	
	}
	
	@Test
	void testPrimo() {
		boolean priEsperada=true;
		boolean priObtenida=Algoritmos.esPrimo(7);
		assertEquals(priEsperada, priObtenida);	
	}

}
