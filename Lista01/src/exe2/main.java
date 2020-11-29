package exe2;

public class main {
	
	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		
		Contato joao = new Contato("joao", "email1");
		Contato maria = new Contato("maria", "email2");
		Contato ana = new Contato("ana", "email3");
		
		agenda.adicionaContato(joao);
		agenda.adicionaContato(maria);
		agenda.adicionaContato(ana);
		
		
		System.out.println("Retornou o seguinte contato: "+agenda.buscarContato("maria").getNome());
		
		
		System.out.println("Tamanho da agenda antes: "+agenda.getContatos().size());
		agenda.removeContato("maria");
		System.out.println("Tamanho da agenda depois: "+agenda.getContatos().size());
		
		
		
		
	}
	

}
