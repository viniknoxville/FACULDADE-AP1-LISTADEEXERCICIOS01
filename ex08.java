import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float n1, n2, n3, n4;

		System.out.println("Digite o valor de N1: ");
		n1 = input.nextFloat();

		System.out.println("Digite o valor de N2: ");
		n2 = input.nextFloat();

		System.out.println("Digite o valor de N3: ");
		n3 = input.nextFloat();

		System.out.println("Digite o valor de N4: ");
		n4 = input.nextFloat();

		float media = (n1 + n2 + n3 + n4) / 4;

		System.out.println("Média aritmética dos valores digitados: " + media);

		input.close();

	}

}
