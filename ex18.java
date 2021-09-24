import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a, b, c, amaior;

		System.out.println("Digite um valor para A: ");
		a = input.nextDouble();

		System.out.println("Digite um valor para B: ");
		b = input.nextDouble();

		System.out.println("Digite um valor para C: ");
		c = input.nextDouble();

		if (a < b) {
			amaior = a;
			a = b;
			b = amaior;
		}
		if (a < c) {
			amaior = a;
			a = c;
			c = amaior;
		}
		if (b < c) {
			amaior = b;
			b = c;
			c = amaior;
		}
		if (a >= (b + c))
			System.out.println("Não forma um triangulo");

		else {
			if (a * a == (b * b + c * c))
				System.out.println("TRIÂNGULO RATÂNGULO");
			if ((a * a) > (b * b + c * c))
				System.out.println("TRIÂNGULO OBTUSÂNGULO");
			if ((a * a) < (b * b + c * c))
				System.out.println("TRIÂNGULO ACUTÂNGULO");

			if (a == b && a == c && b == c)
				System.out.println("TRIÂNGULO EQUILÁTERO");

			else {
				if ((a == b) || (a == c) || (b == c))
					System.out.println("TRIÂNGULO ISÓSCELES");
			}
			input.close();
		}

	}

}
