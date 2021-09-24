import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a, b, c;

		double delta, x1, x2;

		System.out.println("Formula de Bhaskara" + "\n");
		
		System.out.println("Digite um valor para A: ");
		a = input.nextInt();

		System.out.println("Digite um valor para B: ");
		b = input.nextInt();

		System.out.println("Digite um valor para C: ");
		c = input.nextInt();

		delta = ((b * b) - (4 * a * c)); // valor de delta
		x1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a); // valor de x1
		x2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a); // valor de x2

		if ((2*a==0) || (delta < 0)) {
			System.out.println("Impossível calcular"); // delta menor que zero não existe raizes reais 

		} else {
			System.out.println("x1: " + x1 + "\n" + "x2: " + x2);

		}
		input.close();

	}

}

