package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		boolean compraTV50 = (trabalho1 && trabalho2);
		System.out.println("Compra TV de 50\"? " + compraTV50);
		
		boolean compraTV32 = (trabalho1 ^ trabalho2);
		System.out.println("Compra TV de 32\"? " + compraTV32);
		
		boolean tomaSorvete = (trabalho1 || trabalho2);
		System.out.println("Toma sorvete? " + tomaSorvete);
		
		boolean maisSaudavel = !tomaSorvete;
		System.out.println("Mais saudável? " + maisSaudavel);
	}
}
