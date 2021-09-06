package calculadora;

import java.lang.Math;

public class Calculadora {
	public float somar(float n1, float n2) {
		return n1 + n2;
	}

	public float subtrair(float n1, float n2) {
		return n1 - n2;
	}

	public float multiplicar(float valor, float multiplo) {
		return valor * multiplo;
	}

	public float divisao(float dividendo, float divisor) {
		return dividendo / divisor;
	}

	public float potencia(float base, float expoente) {
		return (float) Math.pow(base, expoente);
	}
	
	public float raizQuadrada(float numero) {
		return (float) Math.sqrt(numero);
	}
	
	public byte restoDaDivisao(float dividendo, float divisor) {
		return (byte) (dividendo % divisor);
	}
}
