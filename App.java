package aula.calculadora;

public class App {
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();		
		
		double soma = calculadora.somar(10, 30);
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + calculadora.subtrair(30, 3));
		System.out.println("Divisão: " + calculadora.dividir(30, 3));
		System.out.println("Multiplicação: " + calculadora.multiplicar(30, 3));
		
		calculadora.memorizar();
		System.out.println(calculadora.obterValorDaMemoria());
		
	}

}
