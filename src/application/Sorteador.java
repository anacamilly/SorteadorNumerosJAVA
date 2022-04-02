package application;

import java.util.Random;
import java.util.Scanner;

public class Sorteador{

    public static void main(String[] args){

    	int numero;
    	int qntNumero;
    	int numSort;
    	int opcao;
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);


		do {
			System.out.println("\n\n--------------------------------------");
			System.out.println("         SORTEADOR DE NÚMEROS ");
			System.out.println("1- Realizar Sorteio ");
			System.out.println("2- Sair ");
			System.out.println("Digite a opção desejada: ");
			opcao = teclado.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("Digite a quantidade de números para realizar o sorteio: ");
					qntNumero = teclado.nextInt();
					
					System.out.println("Digite quantos números será sorteado: ");
					numSort = teclado.nextInt();
					
			        int[] numeros = new int[numSort];
			        
			        for(int i=0; i<numeros.length; i++){
			             numero = random.nextInt(qntNumero) + 1;
			             for(int j=0; j<numeros.length; j++){
			                   if(numero == numeros[j] && j != i){
			                         numero = random.nextInt(qntNumero) + 1;
			                   }else{
			                	   numeros[i] = numero;
			                   }
			             }
			        }
		        	System.out.println("Foram sorteados: ");
			        for(int i=0; i<numeros.length; i++){
			             System.out.print(numeros[i]+" - ");
			        }
					System.out.println("\n--------------------------------------");
			        break;
				case 2:
					System.out.println("\n Saindo do Sorteador de Números... ");
					break;
			}
		}while(opcao!=2);
}
}