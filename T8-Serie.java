
public class Serie extends ProgramaTV {
	
	protected int qtdtemporada;
	protected int qtdepisodio;
		
	public Serie(String nome, String categoria, int qtdtemporada, int qtdepisodio) {
		super(nome, categoria);
		this.qtdepisodio = qtdepisodio;
		this.qtdtemporada = qtdtemporada;

	}
	
	public String toString(){
		String programa = c + "-" + nome + " (" + categoria + ")\nTemporada(s):" + qtdtemporada + " - Episodios " + qtdepisodio + "\n";
		programa = programa + "Diretor :" + diretor + "\n";
		programa = programa + "Artistas : \n";
		for( int i = 0; i < artistas.size(); i++) {
			programa = programa + artistas.get(i) + "\n";
		}
		return programa;
	}
}
