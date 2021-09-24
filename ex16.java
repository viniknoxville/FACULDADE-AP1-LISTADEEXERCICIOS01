import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int h1, h2;

		System.out.println("Digite a hora inicial do jogo: ");
		h1 = input.nextInt();

		System.out.println("Digite a hora final do jogo: ");
		h2 = input.nextInt();

		if ((h1 > h2) || (h1 == 0 && h2 == 0)) {
			System.out.println("O jogo durou: " + (24 - h1 + h2) + " hora(s).");
		} else {
			System.out.println("O jogo durou: " + (-(h1 - h2)) + " hora(s).");
		}
		input.close();

	}

}