package main_package;

public class Cargada extends StateArma{

	@Override
	public void disparar(Arma arma) {
		int cantBalas = arma.getBalas();
		cantBalas -= 1;
		
		arma.setBalas(cantBalas);
		if(cantBalas == 0) {
			arma.nextState(new Vacia());
		}
	}

	@Override
	public void cargar(Arma arma) {
		if(arma.getBalas() == arma.getTamCargador()) {
			return;
		}
		
		arma.nextState(new Cargando());
	}
	
}
