package empresa;

public class funcionarioTeste {
	public static void main(String[] args) {
		Funcionario novofuncionario = new Funcionario();
		novofuncionario.nome = "Carolina";
		novofuncionario.funcao = "Engeheira";
		novofuncionario.salario = 3500.00;
		
		Funcionario novofuncionario2 = new Funcionario("Cleiton", "Engenheiro", 7000.50); 
		System.out.println(novofuncionario.Imprimir());
		System.out.println(novofuncionario2.Imprimir());
	}

}
