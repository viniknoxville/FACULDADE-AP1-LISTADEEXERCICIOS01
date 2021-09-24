import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a, b, cons1, cons2;

		System.out.println("Digite um valor para A: ");
		a = input.nextInt();

		System.out.println("Digite um valor para B: ");
		b = input.nextInt();

		cons1 = a + 1;
		cons2 = b + 1;

		System.out.println("Os números consecutivos de A e B são: " + cons1 + ", " + cons2);
		input.close();
	}

}
