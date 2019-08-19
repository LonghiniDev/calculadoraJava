package aula.calculadora;

public class Calculadora {
	private double memoria;
	private double ultimoResultado;	

	public double somar(double v1, double v2) {
		ultimoResultado = v1 + v2;
		return ultimoResultado;
	}
	
	public double subtrair(double v1, double v2) {
		ultimoResultado = v1 - v2;
		return ultimoResultado;
	}

	public double multiplicar(double v1, double v2) {
		ultimoResultado = v1 * v2;
		return ultimoResultado;
	}
	
	public double dividir(double dividendo, double divisor) {
		ultimoResultado = dividendo / divisor; 
		return ultimoResultado;
	}
	
	public void memorizar() {
		memoria = ultimoResultado;
	}
	
	public double obterValorDaMemoria() {
		return memoria;
	}
}
