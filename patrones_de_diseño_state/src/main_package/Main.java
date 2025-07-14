package main_package;

public class Main {

	public static void main(String[] args) {
		try {
			Arma arma = new Arma("Mi arma", 9, 3, 3);
			
			arma.disparar();
			arma.disparar();
			arma.disparar();
			
			arma.disparar();
			
			arma.cargar();
			arma.disparar();
			arma.cargar();
		}catch(Exception e) {
			System.out.println("Ocurrio un error en la ejecucion del programa");
		}
	}

}
