import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a, b, c, d;

		System.out.println("Digite um valor para A: ");
		a = input.nextInt();

		System.out.println("Digite um valor para B: ");
		b = input.nextInt();

		System.out.println("Digite um valor para C: ");
		c = input.nextInt();

		System.out.println("Digite um valor para D: ");
		d = input.nextInt();

		if ((b > c) && (d > a) && ((c + d) > (a + b)) && ((c >= 1) && (d >= 1)) && (a % 2 == 0)) {
			System.out.println("Valores aceitos.");
		} else {
			System.out.println("Valores não aceitos.");
		}
		input.close();

	}

}
