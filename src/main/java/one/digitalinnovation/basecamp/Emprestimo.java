package one.digitalinnovation.basecamp;

public class Emprestimo {
	public static int getDuasParcelas() {
		return 2;
	}

	public static int getTresParcelas() {
		return 3;
	}

	public static Double getTaxaDuasParcelas() {
		return 0.3;
	}

	public static Double getTaxaTresParcelas() {
		return 0.45;
	}

	public static void calcular(double valor, int parcelas) {
		if (parcelas == 2) {
			double vlfinal = valor + ( valor * getTaxaDuasParcelas());
			System.out.println("Valor final do empréstimo para 2 parcelas é " + vlfinal);
		} else if (parcelas == 3) {
			double vlfinal = valor + ( valor * getTaxaTresParcelas());
			System.out.println("Valor final do empréstimo para 3 parcelas é " + vlfinal);
		} else {
			System.out.println("Quantidade de parcelas não aceita");
		}
	}
}
