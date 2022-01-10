package one.digitalinnovation.basecamp;

public class Main {

	public static void main(String[] args) {
		// CALCULADORA
		System.out.println("Exercício Calculadora");
		Calculadora.soma(6, 2);
		Calculadora.subtracao(6, 2);
		Calculadora.multiplicacao(6, 2);
		Calculadora.divisao(6, 2);
		System.out.println("Fim Exercício Calculadora");

		// MENSAGEM
		System.out.println("\nExercício Mensagem");
		Mensagem.obterMensagem();
		System.out.println("Fim Exercício Mensagem");

		// EMPRESTIMO
		System.out.println("\nExercício Empréstimo");
		Emprestimo.calcular(1000, 2);
		Emprestimo.calcular(1000, 3);
		Emprestimo.calcular(1000, 5);
		System.out.println("Fim Exercício Empréstimo");

		// QUADRILÁTERO
		System.out.println("\nExercício Quadrilátero");
		Quadrilatero.area(5);
		Quadrilatero.area(5d,3d);
		Quadrilatero.area(3,5,2);
		Quadrilatero.area(5f,3f);
		System.out.println("Fim Exercício Quadrilátero");
	}

}
