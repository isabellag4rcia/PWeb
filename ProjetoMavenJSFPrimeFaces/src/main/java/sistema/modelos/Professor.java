package sistema.modelos;

public class Professor {
	
	private int rg;
	private String nome;
	private String formacao;
	
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getRg() {
		return rg;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
