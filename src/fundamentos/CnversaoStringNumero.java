package fundamentos;

import javax.swing.JOptionPane;

public class CnversaoStringNumero {
	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Qual a nota 1 ?");
		String resposta2 = JOptionPane.showInputDialog("Qual a nota 2 ?");
		System.out.println("nota1: "+ resposta1 + " " + "nota2: " + resposta2);
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		System.out.println((nota1+nota2)/2);
		
	}

}
