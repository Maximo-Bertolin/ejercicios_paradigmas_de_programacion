package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.Jugador;

class testSingleton {

	@Test
	void test() {
		Jugador miJugador = Jugador.getInstancia();
		
		miJugador.setNombre("Marquitos");
		miJugador.setEmail("marcos@gmail.com");
		
		Jugador otroJugador = Jugador.getInstancia();
		
		otroJugador.setNombre("Jorge");
		otroJugador.setEmail("Jorge@gmail.com");
		
		assertEquals(miJugador.getNombre(), otroJugador.getNombre());
	}

}
