package ejercicio1;

public class Division {
	public static double division(int dividendo, int divisor) throws ArithmeticException{
		if(divisor == 0) {
			throw new ArithmeticException();
		}
		return (double) dividendo / divisor;
	}
}
