package classe;

import javax.naming.spi.DirStateFactory.Result;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(calc.somar(2,1));
		calc.acrescentar(100);
		System.out.println(calc.obterResultado());
		calc.limpar();
		System.out.println(calc.obterResultado());
	}
	
}
