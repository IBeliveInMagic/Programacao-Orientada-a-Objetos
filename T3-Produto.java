
class Produto {
	public int codigo;
	public String nome_produto;
	public int qtd;
	public String tipo;
	public double valor_produto;

	public Produto() {
		this.codigo = 001;
	}
	
	public double vender(int qtdvendida) {
		
		if( this.qtd < qtdvendida ) {
			
			System.out.println("Não possui essa quantidade no estoque.");
			return 0;
			
		}else {
			this.qtd = (this.qtd - qtdvendida);
			System.out.println("Valor total da venda:" + qtdvendida*(this.valor_produto));
			return qtdvendida*(this.valor_produto);
		}
	}
	
	public void comprar_altera(int qtd_amais, double novo_valor) {
		this.qtd = this.qtd + qtd_amais;
		this.valor_produto = novo_valor;
	}
	
	public void comprar_naltera(int qtd_amais) {
		this.qtd = this.qtd + qtd_amais;
	}
	
	public String toString() {
		System.out.println("Codigo:" + this.codigo);
		System.out.println("Nome:" + this.nome_produto);
		System.out.println("Quantidade:" + this.qtd);
		System.out.println("Tipo:" + this.tipo);
		System.out.println("Valor:" + this.valor_produto);
		return "Codigo: " + codigo + "\n Nome" + nome_produto + "\n Quantidade:" + qtd + "\n Tipo:" + tipo + "\n Valor:" + valor_produto + " ";
	}
	
	public void inserir(String novo_nome, int nova_qtd, String novo_tipo, double novo_valor) {
		this.nome_produto = novo_nome;
		this.qtd = nova_qtd;
		this.tipo = novo_tipo;
		this.valor_produto = novo_valor;
	}
	
	public boolean igual(Produto verifica_produto) {
		if((verifica_produto.nome_produto).equals(this.nome_produto) && (verifica_produto.tipo).equals(this.tipo)) {
			return true;
		}
		return false;
	}
}
