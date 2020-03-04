package fundamentos;

public class DesafioAritimeticos {

	public static void main(String[] args) {

//		int operacao1 = (int) Math.pow(6 * (3 + 2), 2);
//		int divisao1 = operacao1 / (3 * 2);
//
//		int operacao2 = (int) Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
//
//		int res1 = divisao1 - operacao2;
//
//		int potencia1 = (int) Math.pow(res1, 3);
//		int potencia2 = (int) Math.pow(10, 3);
//
//		int resFinal = potencia1 / potencia2;
//
//		System.out.println(resFinal);
		
		double numA = Math.pow (6*(3+2), 2);
		double numB = (1-5) * (2-7);
		
		double denA = 3*2;
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);

	}
}
