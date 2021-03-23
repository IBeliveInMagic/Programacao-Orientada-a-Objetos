import javax.swing.JOptionPane;

public class CadastroCliente {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente ("Joaquim de Melo","11254789553");
		Cliente cl2 = new Cliente ("Maria Cleusa Melo","136452784152");
		Cliente cl3 = new Cliente ("Maria Clemente","12555698745");
		Cliente cl4 = new Cliente ("Hiago Freitas","65742155967");
		Cliente cl5 = new Cliente ("Sebastiao Sardinha","32569874123");
		
		Endereco end1 = new Endereco("Neddermeyer");
		end1.numero = 365;
		end1.bairro = "Goiania Viva 2";
		end1.cep = "744561210";
		end1.complemento = "Ao lado da Sorveteria Chiquinhos";
		end1.cidade = "Goiania";
		end1.estado = "Goias";
		
		Endereco end2 = new Endereco("Constantinopla");
		end2.numero = 1284;
		end2.bairro = "Capuava";
		end2.cep = "74426250";
		end2.complemento = "Em frente ao pet shop";
		end2.cidade = "Anapolis";
		end2.estado = "Goias";
		
		Endereco end3 = new Endereco("Av.Brasil");
		end3.numero = 0;
		end3.bairro = "Amarelinho";
		end3.cep = "11598471";
		end3.complemento = "de baixo da ponte";
		end3.cidade = "Santos";
		end3.estado = "Sao Paulo";
		
		cl1.adicionaEndereco(end1);
		cl2.adicionaEndereco(end1);
		cl4.adicionaEndereco(end1);
		cl3.adicionaEndereco(end2);
		cl5.adicionaEndereco(end3);
		
		String mensagem = "Cliente:" + "\n" + cl1 + "\n" + cl2 + "\n" + cl3 + "\n" + cl4 + "\n" + cl5;
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
