package exe1;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		int quantidade = 0;
		MediaAluno notas_joao = new MediaAluno();
		
		System.out.println("Digite a quantidade de notas...");
		Scanner leitor = new Scanner(System.in);
		quantidade = leitor.nextInt();
		
		for(int i=1; i<=quantidade; i++) {
			System.out.println("Digite a "+i+"° nota...");
			notas_joao.adicionarNotas(leitor.nextInt());
		}
		
		notas_joao.calculaMedia(quantidade);

	}
	
	

}
