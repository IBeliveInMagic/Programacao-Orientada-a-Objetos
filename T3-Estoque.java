import java.util.Scanner;

public class Estoque{
		public static class Produto {
			
		public static int codigo;
		public static String nome_produto;
		public static int qtd;
		public static String tipo;
		public static double valor_produto;

		public Produto() {
			codigo = 001;
		}
		
		public double vender(int qtdvendida) {
			
			if( qtd < qtdvendida ) {
				
				System.out.println("Não possui essa quantidade no estoque.");
				return 0;
				
			}else {
				qtd = (qtd - qtdvendida);
				System.out.println("Valor total da venda:" + qtdvendida*(valor_produto));
				return qtdvendida*(valor_produto);
			}
		}
		
		public void comprar_altera(int qtd_amais, double novo_valor) {
			qtd = qtd + qtd_amais;
			valor_produto = novo_valor;
		}
		
		public void comprar_naltera(int qtd_amais) {
			qtd = qtd + qtd_amais;
		}
		
		public String toString() {
			System.out.println("Codigo:" + codigo);
			System.out.println("Nome:" + nome_produto);
			System.out.println("Quantidade:" + qtd);
			System.out.println("Tipo:" + tipo);
			System.out.println("Valor:" + valor_produto);
			return "Codigo: " + codigo + "\n Nome" + nome_produto + "\n Quantidade:" + qtd + "\n Tipo:" + tipo + "\n Valor:" + valor_produto + " ";
		}
		
		public void inserir(String novo_nome, int nova_qtd, String novo_tipo, double novo_valor) {
			nome_produto = novo_nome;
			qtd = nova_qtd;
			tipo = novo_tipo;
			valor_produto = novo_valor;
		}
		
		public boolean igual(Produto verifica_produto){
			if((Estoque.Produto.nome_produto).equals(nome_produto) && (Estoque.Produto.tipo).equals(tipo)) {
				return true;
			}
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		Produto produto = new Produto();
		
		
		int opcao = 1;
		while(opcao > 0) {
			System.out.println("Digite qual operação deseja realizar:");
			System.out.println("1.Vender");
			System.out.println("2.Comprar com alteração no valor do produto");
			System.out.println("3.Comprar sem alteração no valor do produto");
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
					
					System.out.println("Insira o nome do produto que será inserido:");
					nome_produto = sc.nextLine();
					
					System.out.println("Insira a quantidade do produto que será inserido:");
					qtd = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Insira no tipo do produto que será inserido:");
					tipo = sc.nextLine();
					
					System.out.println("Insira o valor do produto que será inserido:");
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
