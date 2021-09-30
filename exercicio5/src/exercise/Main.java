package exercise;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Você quer saber a natalidade ou a mortalidade?\n Digite\n 1 - Mortalidade\n 2 - Natalidade\n ");
	byte opcao = s.nextByte();
	
	switch (opcao) {
	case 1:
		System.out.println("Escolha o número de óbitos: ");
		float obitos = s.nextFloat();
		System.out.println("Escolha o número de habitantes: ");
		float habitantesM = s.nextFloat();
		System.out.printf("A taxa de mortalidade é:" + (obitos * 1000)  / habitantesM + " a cada mil habitantes!");
		break;
	case 2:
		System.out.println("Escolha o número de nascidos: ");
		float nascidos = s.nextFloat();
		System.out.println("Escolha o número de habitantes: ");
		float habitantesN = s.nextFloat();
		System.out.printf(" A taxa de natalidade é: " + (nascidos*1000) / habitantesN + " a cada mil habitantes!");
		break;
	}
	 
	
	
		
		
	}
	
	}


