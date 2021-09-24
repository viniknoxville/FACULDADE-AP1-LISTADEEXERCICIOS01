import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n1;

		System.out.println("Digite um número: ");
		n1 = input.nextInt();

		if (n1 < 0) {
			System.out.println("Você digitou um número negativo");

		} else {
			System.out.println("Esse número não é negativo");
		}
		input.close();

	}
}
