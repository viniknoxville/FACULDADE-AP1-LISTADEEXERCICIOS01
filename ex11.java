import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n1;

		System.out.println("Digite um n�mero: ");
		n1 = input.nextInt();

		if (n1 < 0) {
			System.out.println("Voc� digitou um n�mero negativo");

		} else {
			System.out.println("Esse n�mero n�o � negativo");
		}
		input.close();

	}
}
