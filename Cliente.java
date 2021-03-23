import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String cpf;
	
	private ArrayList<Endereco>endereco = new ArrayList<Endereco>(); 
	
	Cliente(String nome,String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void adicionaEndereco(Endereco end) {
		endereco.add(end);
	}
	
	public String toString() {
		String retorno = nome + " - " + cpf + " - " + " - Endereco:";
		for(int i = 0 ; i < endereco.size();i++) {
			retorno = retorno + " " + endereco.get(i) + ";";
		}
		return retorno;
	}
}
