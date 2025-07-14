package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codigo_ejercicio.Division;


class Test_Division {

	@Test
	void testCorrecto() {
		double resultadoObtenido = Division.division(5, 2);
		double resultadoEsperado = 2.5;
		
		assertEquals(resultadoObtenido, resultadoEsperado, 0.0001);
	}

	@Test
	void testConExcepciones() {
		try {
			Division.division(5, 0);
			fail("No se lanzo la excepcion");
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
