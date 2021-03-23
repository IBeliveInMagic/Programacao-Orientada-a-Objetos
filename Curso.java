import java.util.ArrayList;

public class Curso {
	private String nomecurso;
	String sigla;
	
	private ArrayList<Departamento>departamento = new ArrayList<Departamento>();
	
	Curso(String nome){
		this.nomecurso = nome;
	}
	
	public void adicionaDepartamento(Departamento dep) {
		departamento.add(dep);
	}
	
	public String toString() {
		String retorno = nomecurso + "(" + sigla + ")" + ", Departamento:" ;
		for (int i=0 ; i < departamento.size() ; i++) {
			retorno = retorno + " " + departamento.get(i) + ";";
		}
		return retorno;
	}
}
