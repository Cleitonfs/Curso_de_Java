package controle;

import javax.swing.JOptionPane;

public class If {

	public static void main(String[] args) {
		String nota = JOptionPane.showInputDialog("Informe a nota: ");
		double nota1 = Double.parseDouble(nota);
		boolean bomComportamento = true;
		if (nota1 >= 9 && bomComportamento) {
			System.out.println("Quadro de honra!");
		}
	}
}
