package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main_package.Gerente;
import main_package.Operario;

class TestSueldosTotales {
Gerente director;
	
	Gerente gerente_RR_HH;
	Gerente gerente_produccion;
	Gerente gerente_ventas;
	
	Operario operario_produccion_1;
	Operario operario_produccion_2;
	Operario operario_produccion_3;
	
	Operario operario_RR_HH_1;
	Operario operario_RR_HH_2;
	Operario operario_RR_HH_3;
	Operario operario_RR_HH_4;
	
	Operario operario_ventas_1;
	Operario operario_ventas_2;
	Operario operario_ventas_3;
	Operario operario_ventas_4;
	
	@BeforeEach
	void setUp() {
		this.director = new Gerente(1_000_000, 1, "Jorge Diaz");
		
		this.gerente_RR_HH = new Gerente(800_000, 2, "Juan Perez");
		this.gerente_produccion = new Gerente(850_000, 3, "Martin Fernnadez");
		this.gerente_ventas = new Gerente(900_000, 4, "Jose Carlos Paz");
		
		this.operario_produccion_1 = new Operario(650_000, 5, "Maximo Bertolin");
		this.operario_produccion_2 = new Operario(620_000, 6, "Luis Alfonso");
		this.operario_produccion_3 = new Operario(570_000, 7, "Monkey D. Luffy");
		
		this.operario_RR_HH_1 = new Operario(600_000, 8, "Lionel Messi");
		this.operario_RR_HH_2 = new Operario(580_000, 9, "Goku");
		this.operario_RR_HH_3 = new Operario(615_000, 10, "Alexis McAlister");
		this.operario_RR_HH_4 = new Operario(600_000, 11, "Zoro Roronoa");
		
		this.operario_ventas_1 = new Operario(700_000, 12, "Edward Elric");
		this.operario_ventas_2 = new Operario(650_000, 13, "Marcos Lorenzana");
		this.operario_ventas_3 = new Operario(620_000, 14, "Lautaro Durante");
		this.operario_ventas_4 = new Operario(615_000, 15, "Tomas Iacoi");
		
		director.addEmpleado(gerente_ventas);
		director.addEmpleado(gerente_RR_HH);
		director.addEmpleado(gerente_produccion);
		
		gerente_ventas.addEmpleado(operario_ventas_1);
		gerente_ventas.addEmpleado(operario_ventas_2);
		gerente_ventas.addEmpleado(operario_ventas_3);
		gerente_ventas.addEmpleado(operario_ventas_4);
		
		gerente_RR_HH.addEmpleado(operario_RR_HH_1);
		gerente_RR_HH.addEmpleado(operario_RR_HH_2);
		gerente_RR_HH.addEmpleado(operario_RR_HH_3);
		gerente_RR_HH.addEmpleado(operario_RR_HH_4);
		
		gerente_produccion.addEmpleado(operario_produccion_1);
		gerente_produccion.addEmpleado(operario_produccion_2);
		gerente_produccion.addEmpleado(operario_produccion_3);
	}
	
	@Test
	void testSueldosOperario() {
		double sueldoEsperado = 700_000;
		double sueldoObtenido = operario_ventas_1.getSueldosTotales();
		
		assertEquals(sueldoEsperado, sueldoObtenido);
	}

	@Test
	void testSueldosGerente() {
		double sueldoEsperado = 3_485_000;
		double sueldoObtenido = gerente_ventas.getSueldosTotales();
		
		assertEquals(sueldoEsperado, sueldoObtenido);
	}
}
