package fundamentos;

import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		
		System.out.println("Entre o primeiro valor: ");
		num1 = entrada.nextInt();
		System.out.println("Entre o segundo valor: ");
		num2 = entrada.nextInt();
		
		sum = num1 + num2;
		System.out.println(sum);
		
	}

}
