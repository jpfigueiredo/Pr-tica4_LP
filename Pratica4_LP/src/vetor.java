import java.util.Scanner;
public class vetor {

	public static void main(String[] args) {
		
		
		
		
		int[] notas = new int [10];
		int soma=0, aux;
		Scanner entrada = new Scanner (System.in);
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Digite a nota de posição número " + (i+1));
			
			notas[i] = entrada.nextInt();
			
			soma = soma + notas[i];
		}
		
		//Fazendo a ordenação do vetor, para colocar na ordem crescente
		
	for (int i=0;i<10;i++) {
		
		for (int j=0;j<9;j++) {
			
		if (notas [j]>notas[j+1]) {
			
		}
		aux = notas [j];
		notas [j] = notas [j+1];
		notas [j+1] = aux;
		
		
	}
	}	
	
	System.out.println("A média é "+ soma/10);
	System.out.println("A maior nota é "+ notas[9]);
	System.out.println("A segunda maior nota é "+ notas [8]);
	System.out.println("A terceira maior nota é "+ notas [7]);
	System.out.println("A meno nota é "+ notas [0]);
	
	
	}
	
}
