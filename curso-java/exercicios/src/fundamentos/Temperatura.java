package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 °C
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit");
		double fahrenheit = leia.nextDouble();

		double celcius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("A temperatura em Celcius é: " + celcius + "°C");

		leia.close();
	}
}
  