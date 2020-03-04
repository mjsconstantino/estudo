package fundamentos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		System.out.print("Digite o primeiro sal�rio: ");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o segundo sal�rio: ");
		String salario2 = entrada.next().replace(",", ".");

		System.out.print("Digite o terceiro sal�rio: ");
		String salario3 = entrada.next().replace(",", ".");
		
		double convSal1 = Double.parseDouble(salario1);
		double convSal2 = Double.parseDouble(salario2);
		double convSal3 = Double.parseDouble(salario3);
		
		double mediaSalarial = (convSal1 + convSal2 + convSal3)/3;
		
		System.out.println("\nA m�dia salarial �: " +  deci.format (mediaSalarial));
				
		entrada.close();
		
	}
}
