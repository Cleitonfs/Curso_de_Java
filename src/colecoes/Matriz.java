package colecoes;

public class Matriz {
	public static void main(String[] args) {
		double [][] notasJoao = {{2.7, 8.6},{6.2, 9.7}};
		
		double [][] notasPedro = new double [2][];
		
		notasPedro[0] = new double[2];
		notasPedro[1] = new double[2];
		notasPedro[0][0] = 7.7;
		notasPedro[0][1] = 9.6;
		notasPedro[1][0] = 6.2;
		notasPedro[1][1] = 9.7;
		
		double totalJoao = 0;
		int qtdDeNotasJoao = 0;
		double totalPedro = 0;
		int qtdDeNotasPedro = 0;
		
		for (int i=0; i < notasJoao.length; i++) {
			for (int j=0; j < notasJoao[i].length; j++) {
				totalJoao+=notasJoao[i][j];
				qtdDeNotasJoao++;
			}
		}
		
		for (double[] notasParciais: notasPedro) {
			for ( double nota: notasParciais) {
				totalPedro+=nota;
				qtdDeNotasPedro++;
			}
		}
		
		System.out.println(totalJoao / qtdDeNotasJoao);
		System.out.println(totalPedro / qtdDeNotasPedro);
	}
}

