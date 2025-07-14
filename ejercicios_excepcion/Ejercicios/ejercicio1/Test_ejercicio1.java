package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_ejercicio1 {

	@Test
	void test() {
		double resultadoObtenido = Division.division(5, 1);
		double resultadoEsperado = 5;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}

}
