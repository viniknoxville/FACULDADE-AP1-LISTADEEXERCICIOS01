import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Digite N1: ");
		n1 = input.nextInt();

		System.out.println("Digite N2: ");
		n2 = input.nextInt();

		System.out.println("Digite N3: ");
		n3 = input.nextInt();

		if ((n1 > n2) && (n1 > n3)) {
			System.out.println("N1 é o maior valor");
		} else if ((n2 > n1) && (n2 > n3)) {
			System.out.println("N2 é o maior valor");
		} else {
			System.out.println("N3 é o maior valor");
		}
		input.close();

	}

}
