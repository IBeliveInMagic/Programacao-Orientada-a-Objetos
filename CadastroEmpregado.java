import javax.swing.JOptionPane;

public class CadastroEmpregado {

	public static void main(String[] args) {

//----------------------Empregado----------------------------------------------
		
		Empregado e1 = new Empregado("Tiago Souza");
		e1.matricula = 5692;
		
		Empregado e2 = new Empregado("Nonato Crispim");
		e2.matricula = 9624;
		
		Empregado e3 = new Empregado("Marcela Navalha");
		e3.matricula = 1236;
		
		Empregado e4 = new Empregado("Lucas Leao");
		e4.matricula = 8530;
		
		Empregado e5 = new Empregado("Lua Cristal");
		e5.matricula = 2001;
		
		Empregado e6 = new Empregado("Kristina Nogueira");
		e6.matricula = 9950;
		
//------------------------Empresa--------------------------------------------
		
		Empresa empresa1 = new Empresa("Ricardo Moveis","00.123.448/0001-69");
		empresa1.razao = "Venda de moveis importados";
		
		Empresa empresa2 = new Empresa("Loja Ivone" , "15.111.980/6072-00");
		empresa2.razao = "Venda de produtos Ivone";
		
//---------------------------Endereco--------------------------------------------
		
		Endereco end1 = new Endereco("Henck Arronstraat");
		end1.bairro = "Ma-Retraite 3";
		end1.cep = " Nao Usado";
		end1.complemento = "Em frente a Basilica Sao Pedro e Sao Paulo";
		end1.numero = 20;
		end1.cidade = "Paramaribo";
		end1.estado = "Suriname";
		
		Endereco end2 = new Endereco("Nelly Martins");
		end2.bairro = "Caranda Bosque";
		end2.cep = "79032-295";
		end2.complemento = "Uma rua acima do Pao de Acucar";
		end2.numero = 685195;
		end2.cidade = "Campo Grande";
		end2.estado = "Mato Grosso do Sul";

		
		empresa1.CadastrarEndereco(end2);
		empresa2.CadastrarEndereco(end1);
		
		e1.CadastrarEmpresa(empresa2);
		e2.CadastrarEmpresa(empresa2);
		e3.CadastrarEmpresa(empresa1);
		e4.CadastrarEmpresa(empresa2);
		e5.CadastrarEmpresa(empresa1);
		e6.CadastrarEmpresa(empresa2);
		
		String mensagem = "Empregados " + "\n" + e1 + "\n" + e2 + "\n" + e3 + "\n" + e4 + "\n" + e5 + "\n" + e6;
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
