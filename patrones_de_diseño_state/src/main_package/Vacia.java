package main_package;

public class Vacia extends StateArma{

	@Override
	public void disparar(Arma arma) {
		System.out.println("Cargador vacío");
	}

	@Override
	public void cargar(Arma arma) {
		arma.nextState(new Cargando());
		
		arma.cargar();
	}

}
