package empresa;

public class Funcionario {
	
	String nome, funcao;
	double salario;
	
	Funcionario (){
	}
	
	Funcionario (String n, String f, double s){
		nome = n;
		funcao = f;
		salario = s;	
	}
	String Imprimir (){
		return String.format("Nome: %s\nFun��o: %s\nSal�rio: %.2f\n", nome, funcao, salario);
	}
	
}
