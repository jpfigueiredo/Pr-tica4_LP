import java.util.Scanner;
public class vetor {

	public static void main(String[] args) {
		
		
		
		
		int[] notas = new int [10];
		int soma=0, aux;
		Scanner entrada = new Scanner (System.in);
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Digite a nota de posi��o n�mero " + (i+1));
			
			notas[i] = entrada.nextInt();
			
			soma = soma + notas[i];
		}
		
		//Fazendo a ordena��o do vetor, para colocar na ordem crescente
		
	for (int i=0;i<10;i++) {
		
		for (int j=0;j<9;j++) {
			
		if (notas [j]>notas[j+1]) {
			
		}
		aux = notas [j];
		notas [j] = notas [j+1];
		notas [j+1] = aux;
		
		
	}
	}	
	
	System.out.println("A m�dia � "+ soma/10);
	System.out.println("A maior nota � "+ notas[9]);
	System.out.println("A segunda maior nota � "+ notas [8]);
	System.out.println("A terceira maior nota � "+ notas [7]);
	System.out.println("A meno nota � "+ notas [0]);
	
	
	}
	
}
