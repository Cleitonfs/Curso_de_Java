package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.nome = "Notebook Acer";
		produto1.preco = 4000.00;
		Produto.desconto = 0.10;
		
		Produto produto2 = new Produto("Caneta Bic", 3.50);
		
		System.out.println(produto1.precoComDesconto());
		System.out.println(produto2.precoComDesconto());
		
		
		
	}
	
	

}
