package exercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calculos prod1 = new Calculos();
		prod1.nomeProduto = ("Renault");
		prod1.quantidade = (1);
		prod1.valorProduto = (29000);
		byte produto;
		System.out.println("O valor do carro Renault Sandero � R$29000!!!");
		System.out.println("Deseja pagar o "+prod1.nomeProduto+":\n 1 - � vista\n 2 - � prazo(30 dias)\n 3 - parcelado com juros de 1,5 ao m�s");
		produto = s.nextByte();
		switch (produto) {
		case 1:
			System.out.println("Voc� escolheu � vista! e recebeu 10% de desconto.");
			System.out.printf("O receber�"+prod1.nomeProduto+" um desconto de:\n R$" + (prod1.valorProduto * 10) / 100);
			System.out.printf("E sair� por R$ " + (prod1.valorProduto - 2900) + "!");
			break;
			
			
		case 2:
			System.out.println("Voc� escolheu � prazo! e foi acrescido um valor de 3% de juros!");
			System.out.println("O juros foi de: R$ " + (prod1.valorProduto * 0.03));
			System.out.printf("E sair� por R$ " + (prod1.valorProduto + 870) + "!");
			break;
		case 3:
			System.out.println("Voc� escolheu � prazo parcelado! ser� acrescentado 1,5% de juros mensalmente durante 12 meses!");
			System.out.println("O juros foi de: R$ " + (prod1.valorProduto * 0.015));
			System.out.printf("E sair� por R$" + (prod1.valorProduto + 5220) + " ao completar os 12 meses!");
			break;
		}
	
	}

}
