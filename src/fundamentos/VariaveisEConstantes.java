package fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		final double PI = 3.1416;
		double raioCincunferencia;
		raioCincunferencia = 2.0;
		double area = PI*raioCincunferencia*raioCincunferencia;
		System.out.println("A �rea da circunfer�ncia �: " + area + " m2.");
		System.out.printf("A �rea da circunfer�ncia �: %f m2.\n", area);
		System.out.printf("A �rea da circunfer�ncia �: %.2f m2.", area);
	}

}
