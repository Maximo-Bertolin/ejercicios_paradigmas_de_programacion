package main_package;

public class Jugador {
	private static Jugador instancia;
	private String nombre;
	private String email;
	
	static {
		Jugador.instancia = null;
	}
	
	public static Jugador getInstancia() {
		if(instancia == null) {
			Jugador.instancia = new Jugador();
		}
		return Jugador.instancia;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
