package one.digitalinnovation.basecamp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mensagem {
	
	public static void obterMensagem() {
		
		Date horario = new Date();
		String hora = new SimpleDateFormat("HH:mm").format(horario);
		switch (hora.substring(0, 2)) {
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "10":
			case "11":
			case "12":
				mensagemBomDia(hora);
				break;
			case "13":
			case "14":
			case "15":
			case "16":
			case "17":
				mensagemBoaTarde(hora);
				break;
			case "18":
			case "19":
			case "20":
			case "21":
			case "22":
			case "23":
			case "24":
			case "1":
			case "2":
			case "3":
			case "4":
				mensagemBoaNoite(hora);
				break;
			default:
				System.out.println("Hora Inválida");
				break;
		}
	}

	public static void mensagemBomDia(String hora) {
		System.out.println("Bom dia! São " + hora);
	}

	public static void mensagemBoaTarde(String hora) {
		System.out.println("Bom Tarde! São " + hora);
	}
	
	public static void mensagemBoaNoite(String hora) {
		System.out.println("Bom Noite! São " + hora);
	}
	
}
