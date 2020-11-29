package exe2;

public class Contato {
	
	private String nome;
	private String email;
	
	public Contato(String n, String e) {	
		nome = n;
		email = e; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
