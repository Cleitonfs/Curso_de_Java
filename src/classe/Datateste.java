package classe;

public class Datateste {
	public static void main(String[] args) {
		
		Data nascimento = new Data ();
		nascimento.dia = 19;
		nascimento.mes = 11;
		nascimento.ano = 1989;
		
		Data casamento = new Data(4, 8, 2017);
		
		System.out.println(nascimento.formatar());
		System.out.println(casamento.formatar());
		
		//System.out.println(nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano);		
	}
}
