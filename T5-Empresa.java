import java.util.ArrayList;

public class Empresa {
	private String nome;
	private String cnpj;
	String razao;
	
	private ArrayList<Endereco>endereco = new ArrayList<Endereco>();
	
	Empresa(String nome,String cnpj){
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public void CadastrarEndereco(Endereco end) {
		endereco.add(end);
	}
	
	public String toString() {
		String retorno = nome + " - " + cnpj + " - " + razao + "Endereco: ";
		for(int i = 0 ; i < endereco.size() ; i++) {
			retorno = retorno + " " + endereco.get(i) + ";";
		}
		return retorno;
	}
}
