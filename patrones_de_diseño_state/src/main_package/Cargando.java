package main_package;

public class Cargando extends StateArma{
	private int cantConsultas;
	
	public Cargando() {
		this.cantConsultas = 0;
	}
	
	@Override
	public void disparar(Arma arma) {
		System.out.println("No puede dispararse, carga en proceso");
	}

	@Override
	public void cargar(Arma arma) {
		if(this.cantConsultas < 1) {
			System.out.println("Cargando...");
			
			return;
		}
		
		System.out.println("Arma cargada");
		arma.nextState(new Cargada());
	}

}
