
public class Departamento {
	private String nomedep;
	String sigladep;
	
	Departamento(String nome){
		this.nomedep = nome;
	}
	
	public String toString() {
		return nomedep + "(" + sigladep + ")";
	}
	
}
