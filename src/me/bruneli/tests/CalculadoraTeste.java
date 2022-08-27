package me.bruneli.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

import me.bruneli.main.Calculadora;

public class CalculadoraTeste {
	
	private Calculadora calculadora = new Calculadora();
	
	//Testes da função soma
	@Test
	public void testarSoma() {
		assertAll("Deve testar somar", () -> {
			// Método somar(0,0) deve retornar 0
			assertEquals(calculadora.somar(0, 0), 0, .02);
			// Método somar(0,5) deve retornar 5
			assertEquals(calculadora.somar(0, 5), 5, .02);
			// Método somar(5,0) deve retornar 5
			assertEquals(calculadora.somar(5, 0), 5, .02);
			// Método somar(7,7) deve retornar 7
			assertEquals(calculadora.somar(7, 7), 14, .02);
		});
	}
	@Test
	public void testarSubtracao() {
		assertAll("Deve testar subtração", () -> {
			// Método subtrair(0,0) deve retornar 0
			assertEquals(calculadora.subtrair(0, 0), 0, .02);
			// Método subtrair(0,5) deve retornar -5
			assertEquals(calculadora.subtrair(0, 5), -5, .02);
			// Método subtrair(5,0) deve retornar 5
			assertEquals(calculadora.subtrair(5, 0), 5, .02);
			// Método subtrair(7,7) deve retornar 14
			assertEquals(calculadora.subtrair(7, 7), 0, .02);
		});
	}
	@Test
	public void testarMultiplicacao() {
		assertAll("Deve testar multiplicacao", () -> {
			// Método multiplicar(0,0) deve retornar 0
			assertEquals(calculadora.multiplicar(0, 0), 0, .02);
			// Método multiplicar(0,5) deve retornar 0
			assertEquals(calculadora.multiplicar(0, 5), 0, .02);
			// Método multiplicar(5,0) deve retornar 0
			assertEquals(calculadora.multiplicar(5, 0), 0, .02);
			// Método multiplicar(7,7) deve retornar 49
			assertEquals(calculadora.multiplicar(7, 7), 49, .02);
		});
	}
	@Test
	public void testarDivisao() {
		assertAll("Deve testar divisão", () -> {
			// No Java quando se divide um double por 0 ele retorna inifinito, portanto o teste abaixo testa esta condição adversa
			assertTrue(Double.isInfinite(calculadora.dividir(1, 0)));
			// Método dividir(0,5) deve retornar 0
			assertEquals(calculadora.dividir(0, 5), 0, .02);
			// Método dividir(7,7) deve retornar 1
			assertEquals(calculadora.dividir(7, 7), 1, .02);
		});
	}
	


}
