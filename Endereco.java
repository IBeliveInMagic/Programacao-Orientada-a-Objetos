
public class Endereco {
	private String rua;
	int numero;
	String complemento;
	String cep;
	String bairro;
	String cidade;
	String estado;
	
	Endereco(String rua){
		this.rua = rua;
	}
	
	public String toString() {
		return rua + ", " + numero + "(" + complemento + ") " + cep + ", " + bairro + " - " + cidade + " - " + estado;
	}
}
