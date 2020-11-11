package aula.calculadora;

public class App {
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();		
		
		double soma = calculadora.somar(10, 30);
		System.out.println("Soma: " + soma);
		System.out.println("Subtra��o: " + calculadora.subtrair(30, 3));
		System.out.println("Divis�o: " + calculadora.dividir(30, 3));
		System.out.println("Multiplica��o: " + calculadora.multiplicar(30, 3));
		
		calculadora.memorizar();
		System.out.println(calculadora.obterValorDaMemoria());
		
	}

}
