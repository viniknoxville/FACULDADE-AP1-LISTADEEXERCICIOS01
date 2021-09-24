import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a, b, produto;

		System.out.println("Digite um valor para A: ");
		a = input.nextInt();

		System.out.println("Digite um valor para B: ");
		b = input.nextInt();

		produto = (a * b);

		System.out.println("Valor do produto de A e B: " + produto);

		input.close();
	}

}