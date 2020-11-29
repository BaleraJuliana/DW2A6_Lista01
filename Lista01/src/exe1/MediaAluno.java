package exe1;

public class MediaAluno {
	
	private int SIZE; 
	private int[] notas;
	private int cont;
	
	public MediaAluno() {
		SIZE = 10;
		notas = new int[SIZE];
		cont=0;
	}
	
	public void adicionarNotas(int n) {
		if(n>0 && n<100) {
			notas[cont++] = n;
		} else {
			System.out.println("Valor inválido ! ");
		}
	}
	
	public void calculaMedia(int q) {
		
		double media = 0;
		for(int i=0; i<cont; i++){
			media = media + notas[i];
		}
		
		System.out.println("Media: "+(media/q));
	}
}
