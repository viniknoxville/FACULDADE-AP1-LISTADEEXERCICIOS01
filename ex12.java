import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double l, r, quadrado, circulo;

		System.out.println("Digite o valor de L para área do quadrado: ");
		l = input.nextDouble();

		System.out.println("Digite o valor de R para a área do Circulo: ");
		r = input.nextDouble();

		quadrado = (l * l); // área do quadrado > A = L²

		circulo = Math.PI * (r * r); // área do circulo > A = Pi * r²

		if (quadrado > circulo) {
			System.out.println("O quadrado é maior que o Circulo");
		} else {
			System.out.println("O circulo é maior que o quadrado");
		}
		input.close();

	}

}
