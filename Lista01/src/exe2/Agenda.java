package exe2;

import java.util.LinkedList;

public class Agenda {
	
	private LinkedList<Contato> contatos;
	
	public Agenda() {
		contatos = new LinkedList<Contato>();
	}
	
	public void adicionaContato(Contato c) {
		contatos.add(c);	
	}
	
	public Contato buscarContato(String nome) {
		
		for(Contato c : contatos) {
			if(c.getNome().equals(nome)) {
				return c;
			}
		}
		
		System.out.println("Nao deu certo");
		return null;
	}
	
	public void removeContato(String nome) {
		for(Contato c : contatos) {
			if(c.getNome().equals(nome)) {
				contatos.remove(c);
				break;
			}
		}		
	}
	
	public LinkedList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(LinkedList<Contato> contatos) {
		this.contatos = contatos;
	}
}
