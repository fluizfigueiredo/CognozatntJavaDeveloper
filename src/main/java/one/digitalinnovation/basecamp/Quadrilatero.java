package one.digitalinnovation.basecamp;

public class Quadrilatero {
	public static void area(double lado) {
		System.out.println("Àrea do Qudrado é " + lado * lado);
	}

	public static void area(double lado1, double lado2) {
		System.out.println("Àrea do Retângulo é " + lado1 * lado2);
	}

	public static void area(double baseMenor, double baseMaior, double altura) {
		System.out.println("Àrea do Trapézio é " + ((baseMenor + baseMaior) * altura) / 2);
	}

	public static void area(float diagonal1, float diagonal2) {
		System.out.println("Àrea do Losango é " + ((diagonal1 * diagonal2) / 2));
	}
}
