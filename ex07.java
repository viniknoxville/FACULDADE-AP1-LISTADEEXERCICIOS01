import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a, b, hip;

		System.out.println("Digite um valor para A: ");
		a = input.nextDouble();

		System.out.println("Digite um valor para B: ");
		b = input.nextDouble();

		hip = Math.sqrt((a * a) + (b * b));

		System.out.println("O valor da hipotenusa é: " + hip);
		input.close();
	}

}
