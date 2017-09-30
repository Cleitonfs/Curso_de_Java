package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;

		do {
			nota = scanner.nextDouble();
			if (nota >= 0 && nota <= 10) {
				somaDasNotas += nota;
				numeroDeNotas++;
			}

		} while (nota != -1);
		scanner.close();
		System.out.printf("Media %.2f", somaDasNotas / numeroDeNotas);

	}

}