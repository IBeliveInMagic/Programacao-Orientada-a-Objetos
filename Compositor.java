public class Compositor {
	private String nome;
	String nacionalidade;
	
	Compositor(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return nome + " - " + nacionalidade;
	}
}