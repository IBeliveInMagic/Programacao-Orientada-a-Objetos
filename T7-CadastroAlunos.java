import javax.swing.JOptionPane;

public class CadastroAlunos {

	public static void main(String[] args) {

//-----------------------------Departamentos----------------------------------------------
		
		Departamento dep1 = new Departamento ("Instituto de Informatica");
		dep1.sigladep = "INF";
		
		Departamento dep2 = new Departamento ("Instituto de Fisica");
		dep2.sigladep = "IF";
		
		Departamento dep3 = new Departamento ("Instituto de Matematica");
		dep3.sigladep = "IME";
		
//------------------------------Cursos------------------------------------------------------
		
		Curso cu1 = new Curso("Ciencia da Computacao");
		cu1.sigla = "CC";
		cu1.adicionaDepartamento(dep1);
		
		Curso cu2 = new Curso("Matematica");
		cu2.sigla = "Mat";
		cu2.adicionaDepartamento(dep3);
		
		Curso cu3 = new Curso("Fisica");
		cu3.sigla = "Fis";
		cu3.adicionaDepartamento(dep2);
		
		Curso cu4 = new Curso("Inteligencia Artificial");
		cu4.sigla = "IA";
		cu4.adicionaDepartamento(dep1);
		
//---------------------------------Alunos----------------------------------------------------------
		
		Alunos al1 = new Alunos("Lays Melo");
		al1.matricula = "201542648";
		al1.ano = 2015;
		al1.adicionaCurso(cu1);
		
		Alunos al2 = new Alunos("Pedro Henrique");
		al2.matricula = "201914873";
		al2.ano = 2019;
		al2.adicionaCurso(cu4);
		
		Alunos al3 = new Alunos("João Paulo");
		al3.matricula = "202036487";
		al3.ano = 2020;
		al3.adicionaCurso(cu4);
		
		Alunos al4 = new Alunos("Ingrid Teixeira");
		al4.matricula = "201978425";
		al4.ano = 2019;
		al4.adicionaCurso(cu3);
		
		Alunos al5 = new Alunos("Maria Gadu");
		al5.matricula = "2017635842";
		al5.ano = 2017;
		al5.adicionaCurso(cu2);
		
		Alunos al6 = new Alunos("Mariana Guimaraes");
		al6.matricula = "201749363";
		al6.ano = 2017;
		al6.adicionaCurso(cu1);
		
		Alunos al7 = new Alunos("Joao Cleber");
		al7.matricula = "201803615";
		al7.ano = 2018;
		al7.adicionaCurso(cu3);
		
		Alunos al8 = new Alunos("Ur Freitas");
		al8.matricula = "202110600";
		al8.ano = 2021;
		al8.adicionaCurso(cu3);
		
		String mensagem = "Alunos:" + "\n" + al1 + "\n" + al2 + "\n" + al3 + "\n" + al4 + "\n" + al5 + "\n" + al6 + "\n" + al7 + "\n" + al8;
		JOptionPane.showMessageDialog(null, mensagem);
				
	}

}
