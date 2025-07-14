package main_package;

public class Operario implements Empleado{
	private double sueldo;
	private int nroLegajo;
	private String nombre;
	
	public Operario(double sueldo, int nroLegajo, String nombre) {
		this.sueldo = sueldo;
		this.nroLegajo = nroLegajo;
		this.nombre = nombre;
	}
	
	public void imprimirOrganigrama() {
		System.out.println("nombre: " + this.nombre + ", legajo: " + this.nroLegajo);
	}
	
	public void imprimirOrganigrama(int pos) {
		for(int i = 0; i < pos; i++) {
			System.out.print('\t');
		}
		System.out.println("nombre: " + this.nombre + ", legajo: " + this.nroLegajo);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getSueldosTotales() {
		return this.sueldo;
	}
	
	public int getCantidadEmpleados() {
		return 1;
	}
	
	public int getNroLegajo() {
		return this.nroLegajo;
	}
	
	public boolean equals(Empleado empleado) {
		return this.nroLegajo == empleado.getNroLegajo();
	}
}
