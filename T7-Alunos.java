import java.util.ArrayList;

public class Alunos {
	private String nome;
	String matricula;
	int ano;
	private ArrayList<Curso> curso = new ArrayList<Curso>();
	
	Alunos(String nome){
		this.nome = nome;
	}
	
	public void adicionaCurso(Curso cur) {
		curso.add(cur);
	}
	
	public String toString() {
		String retorno = nome + " - " + matricula + " - " + ano + " - Curso:" ;
		for (int i=0 ; i < curso.size() ; i++) {
			retorno = retorno + " " + curso.get(i) + ";";
		}
		return retorno;
	}
}
