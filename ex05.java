import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float l, area;

		System.out.println("Digite o valor de L: ");
		l = input.nextFloat();

		area = (l * l);

		System.out.println("A área do seu quadrado de lado L é: " + area);

		input.close();

	}

}
