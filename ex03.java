import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a, b, qa, qb, soma;

		System.out.println("Digite um valor para A: ");
		a = input.nextInt();

		System.out.println("Digite um valor para B: ");
		b = input.nextInt();

		qa = (a * a);

		qb = (b * b);

		soma = (qa + qb);

		System.out.println("Soma do quadrado de A e B: " + soma);

		input.close();
	}

}
