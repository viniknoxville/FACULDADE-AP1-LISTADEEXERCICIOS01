import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float n1, n2, div1, div2;

		System.out.println("Digite N1: ");
		n1 = input.nextInt();

		System.out.println("Digite N2: ");
		n2 = input.nextInt();

		div1 = (n1 / n2);
		div2 = (n2 / n1);

		if (n1 > n2) {
			System.out.println("Resultado da divisão de N1 por N2: " + div1);

		} else {
			System.out.println("Resultado da divisão de N2 por N1: " + div2);
		}
		input.close();
	}
}
