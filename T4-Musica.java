import java.util.ArrayList;

public class Musica {
	private String nome;
	int ano;
	String tipo;
	
	private ArrayList<Compositor>compositores = new ArrayList<Compositor>();
			
	Musica(String nome){
		this.nome = nome;
	}
	
	public void adicionaCompositor(Compositor comp) {
		compositores.add(comp);
	}
	
	public String toString() {
		String retorno = nome + " - " + ano + " - " + tipo + " - Compositores:";
		for(int i = 0 ; i < compositores.size();i++) {
			retorno = retorno + " " + compositores.get(i) + ";";
		}
		return retorno;
	}
}
