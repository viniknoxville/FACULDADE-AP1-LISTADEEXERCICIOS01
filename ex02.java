import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a, b;

		System.out.println("Digite um valor para A (base): ");
		a = input.nextInt();

		System.out.println("Digite um valor para b (expoente): ");
		b = input.nextInt();
		
		System.out.println("Resultado: " + Math.pow(a, b));

		input.close();
	}

}
