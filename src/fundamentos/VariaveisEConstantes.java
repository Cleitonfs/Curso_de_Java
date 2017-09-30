package fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		final double PI = 3.1416;
		double raioCincunferencia;
		raioCincunferencia = 2.0;
		double area = PI*raioCincunferencia*raioCincunferencia;
		System.out.println("A área da circunferência é: " + area + " m2.");
		System.out.printf("A área da circunferência é: %f m2.\n", area);
		System.out.printf("A área da circunferência é: %.2f m2.", area);
	}

}
