package main_package;

import java.util.ArrayList;

public class Gerente implements Empleado{
	private ArrayList<Empleado> listaSubordinados;
	private double sueldo;
	private int nroLegajo;
	private String nombre;
	
	public Gerente(double sueldo, int nroLegajo, String nombre) {
		this.sueldo = sueldo;
		this.nombre = nombre;
		this.nroLegajo = nroLegajo;
		listaSubordinados = new ArrayList<Empleado>();
	}
	
	public void imprimirOrganigrama() {
		this.imprimirOrganigrama(0);
	}
	
	public void imprimirOrganigrama(int pos) {
		for(int i = 0; i < pos; i++) {
			System.out.print('\t');
		}
		System.out.println("nombre: " + this.nombre + ", legajo: " + this.nroLegajo);
		for(Empleado e : this.listaSubordinados) {
			e.imprimirOrganigrama(pos + 1);
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void addEmpleado(Empleado empleado) {
		if(!listaSubordinados.contains(empleado)) {
			listaSubordinados.add(empleado);
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Empleado> getListaSubordinados(){
		return (ArrayList<Empleado>) this.listaSubordinados.clone();
	}
	
	public void eliminarEmpleado(Empleado empleado) {
		this.listaSubordinados.remove(empleado);
	}
	
	public int getCantidadEmpleados() {
		int cantidad = 1;
		
		for(Empleado e : this.listaSubordinados) {
			cantidad += e.getCantidadEmpleados();
		}
		
		return cantidad;
	}
	
	public double getSueldosTotales() {
		double sueldosTotales = this.sueldo;
		
		for(Empleado e : this.listaSubordinados) {
			sueldosTotales += e.getSueldosTotales();
		}
		
		return sueldosTotales;
	}
	
	public int getNroLegajo() {
		return this.nroLegajo;
	}
	
	public boolean equals(Empleado empleado) {
		return this.nroLegajo == empleado.getNroLegajo();
	}
}
