package br.com.mmarion;

public class Exemplo1 {

	public static void main(String[] args) {
		String ambiente = args[0];
		
		if(ambiente.equalsIgnoreCase("DEV")) {
			System.out.print("Iniciando DEV...");
		} else if(ambiente.equalsIgnoreCase("TEST")) {
			System.out.print("Iniciando DEV...");
		} 

	}

}
