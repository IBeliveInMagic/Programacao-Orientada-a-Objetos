import java.util.Scanner;

public class ExercLab1_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Curso cursos[] = new Curso[4];
		
		for(int i = 0 ; i < 4 ; i++) {
			
			cursos[i] = new Curso();
			
			System.out.printf("Insira o nome do curso:");
			
			if(i > 0) sc.nextLine();
			
			String nome = sc.nextLine();
			cursos[i].Nome_Curso = nome;
			
			System.out.printf("Insira o turno do curso:");
			
			String turno = sc.nextLine();	
			cursos[i].Turno = turno;
			
			System.out.printf("Insira o tipo do curso:");
			
			String tipo = sc.nextLine();
			cursos[i].Tipo = tipo;
			
			System.out.printf("Insira a quantidade de períodos do curso:");		
			
			int periodo = sc.nextInt();
			cursos[i].Qtd_periodos = periodo;
			
		}
		
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println("Curso " + (i+1) + ":");
			System.out.println("Nome: " + cursos[i].Nome_Curso );
			System.out.println("Turno: " + cursos[i].Turno);
			System.out.println("Tipo: " + cursos[i].Tipo );
			System.out.println("Quantidade de periodos: " + cursos[i].Qtd_periodos);
			System.out.println();
		}		
		
		sc.close();
	}

}
