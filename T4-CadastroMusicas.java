import javax.swing.JOptionPane;

public class CadastroMusicas {
	
	public static void main(String[] args) {
		
		Compositor comp1 = new Compositor ("Kanye West");
		comp1.nacionalidade = "Estadunidense";
		
		Compositor comp2 = new Compositor ("Sidoka");
		comp2.nacionalidade = "Brasileiro";
		
		Compositor comp3 = new Compositor ("Rebelde");
		comp3.nacionalidade = "Mexicana";
		
		Musica mu1 = new Musica("Black Skinhead");
		mu1.ano = 2013;
		mu1.tipo= "HipHop/Rap";
		
		Musica mu2 = new Musica("Porsche");
		mu2.ano = 2019;
		mu2.tipo= "Trap/Rap";
		
		Musica mu3 = new Musica("Fuera");
		mu3.ano = 2005;
		mu3.tipo= "Pop";
		
		
		mu1.adicionaCompositor(comp1);
		mu2.adicionaCompositor(comp2);
		mu3.adicionaCompositor(comp3);
		
		
		String mensagem = "Música " + "\n" + mu1 + "\n" + mu2 + "\n" + mu3;
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
