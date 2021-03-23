import java.util.ArrayList;

public class Empregado {
	private String nome;
	int matricula;
	
	private ArrayList<Empresa>empresa = new ArrayList<Empresa>();
	
	Empregado(String nome){
		this.nome = nome;
	}
	
	public void CadastrarEmpresa(Empresa emp) {
		empresa.add(emp);
	}
	
	public String toString() {
		String retorno = nome + " - " + matricula + "Empresa: ";
		for(int i = 0 ; i < empresa.size() ; i++) {
			retorno = retorno + " " + empresa.get(i) + ";";
		}
		return retorno;
	}
}
