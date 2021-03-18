import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		Produto produto = new Produto();
		
		
		int opcao = 1;
		while(opcao > 0) {
			System.out.println("Digite qual opera��o deseja realizar:");
			System.out.println("1.Vender");
			System.out.println("2.Comprar com altera��o no valor do produto");
			System.out.println("3.Comprar sem altera��o no valor do produto");
			System.out.println("4.Inserir produto");
			System.out.println("5.Consultar produtos");
			System.out.println("6.Comparar produtos");
			System.out.println("0.Parar programa");
			
			opcao = sc.nextInt();
			sc.nextLine();
			
			int qtd;
			double valor_produto;
			String nome_produto,tipo;
			
			switch(opcao) {
				case 1:
					System.out.println("Insira a quantidade de produtos a serem vendidos:");
					qtd = sc.nextInt();
					sc.nextLine();
					
					produto.vender(qtd);
					System.out.println();
					break;
					
				case 2:
					System.out.println("Insira a quantidade de produtos a serem adicionados:");
					qtd = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Insira o novo valor do produto:");
					valor_produto = sc.nextDouble();
					sc.nextLine();
					
					produto.comprar_altera(qtd, valor_produto);
					
					System.out.println();
					break;
					
				case 3:
					System.out.println("Insira a quantidade de produtos a serem adicionados:");
					qtd = sc.nextInt();
					sc.nextLine();
					produto.comprar_naltera(qtd);
					System.out.println();
					break;
				case 4:
					
					System.out.println("Insira o nome do produto que ser� inserido:");
					nome_produto = sc.nextLine();
					
					System.out.println("Insira a quantidade do produto que ser� inserido:");
					qtd = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Insira no tipo do produto que ser� inserido:");
					tipo = sc.nextLine();
					
					System.out.println("Insira o valor do produto que ser� inserido:");
					valor_produto = sc.nextDouble();
					
					sc.nextLine();
					produto.inserir(nome_produto, qtd, tipo,valor_produto);
					System.out.println();
					break;
				case 5:
					produto.toString();
					System.out.println();
					break;
				case 6:
					if(produto.igual(produto)) {
						System.out.println("Verdadeiro");
					}else {
						System.out.println("Falso");						
					}
					System.out.println();
					break;
				case 0:
					break;
			}
		}
		sc.close();
	}

}
