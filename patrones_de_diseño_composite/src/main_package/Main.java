package main_package;

public class Main {

	public static void main(String[] args) {
		Gerente director = new Gerente(1_000_000, 1, "Jorge Diaz");
		
		Gerente gerente_RR_HH = new Gerente(800_000, 2, "Juan Perez");
		Gerente gerente_produccion = new Gerente(850_000, 3, "Martin Fernnadez");
		Gerente gerente_ventas = new Gerente(900_000, 4, "Jose Carlos Paz");
		
		Operario operario_produccion_1 = new Operario(650_000, 5, "Maximo Bertolin");
		Operario operario_produccion_2 = new Operario(620_000, 6, "Luis Alfonso");
		Operario operario_produccion_3 = new Operario(570_000, 7, "Monkey D. Luffy");
		
		Operario operario_RR_HH_1 = new Operario(600_000, 8, "Lionel Messi");
		Operario operario_RR_HH_2 = new Operario(580_000, 9, "Goku");
		Operario operario_RR_HH_3 = new Operario(615_000, 10, "Alexis McAlister");
		Operario operario_RR_HH_4 = new Operario(600_000, 11, "Zoro Roronoa");
		
		Operario operario_ventas_1 = new Operario(700_000, 12, "Edward Elric");
		Operario operario_ventas_2 = new Operario(650_000, 13, "Marcos Lorenzana");
		Operario operario_ventas_3 = new Operario(620_000, 14, "Lautaro Durante");
		Operario operario_ventas_4 = new Operario(615_000, 15, "Tomas Iacoi");
		
		
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
		
		System.out.println("Sueldos totales en la empresa: " + director.getCantidadEmpleados());
	}

}
