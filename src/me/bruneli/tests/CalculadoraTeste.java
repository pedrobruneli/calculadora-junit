package me.bruneli.tests;

import me.bruneli.main.Calculadora;

public class CalculadoraTeste {

	private static Calculadora calculadora = new Calculadora();

	public static void main(String[] args) {
		rodarTestes();
	}

	// Rodar testes
	public static void rodarTestes() {
		testarSoma();
		testarSubtracao();
		testarMultiplicacao();
		testarDivisao();
	}

	// Testes da função soma
	public static void testarSoma() {
		// Método somar(0,0) deve retornar 0
		System.out.println(calculadora.somar(0, 0));
		// Método somar(0,5) deve retornar 5
		System.out.println(calculadora.somar(0, 5));
		// Método somar(5,0) deve retornar 5
		System.out.println(calculadora.somar(5, 0));
		// Método somar(7,7) deve retornar 7
		System.out.println(calculadora.somar(7, 7));
	}

	public static void testarSubtracao() {
		// Método subtrair(0,0) deve retornar 0
		System.out.println(calculadora.subtrair(0, 0));
		// Método subtrair(0,5) deve retornar -5
		System.out.println(calculadora.subtrair(0, 5));
		// Método subtrair(5,0) deve retornar 5
		System.out.println(calculadora.subtrair(5, 0));
		// Método subtrair(7,7) deve retornar 14
		System.out.println(calculadora.subtrair(7, 7));
	}

	public static void testarMultiplicacao() {
		// Método multiplicar(0,0) deve retornar 0
		System.out.println(calculadora.multiplicar(0, 0));
		// Método multiplicar(0,5) deve retornar 0
		System.out.println(calculadora.multiplicar(0, 5));
		// Método multiplicar(5,0) deve retornar 0
		System.out.println(calculadora.multiplicar(5, 0));
		// Método multiplicar(7,7) deve retornar 49
		System.out.println(calculadora.multiplicar(7, 7));
	}

	public static void testarDivisao() {
		// No Java quando se divide um double por 0 ele retorna inifinito, portanto o
		// teste abaixo testa esta condição adversa
		System.out.println(calculadora.dividir(1, 0));
		// Método dividir(0,5) deve retornar 0
		System.out.println(calculadora.dividir(0, 5));
		// Método dividir(7,7) deve retornar 1
		System.out.println(calculadora.dividir(7, 7));
	}

}
