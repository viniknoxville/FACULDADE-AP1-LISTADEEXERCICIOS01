import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double l, r, quadrado, circulo;

		System.out.println("Digite o valor de L para �rea do quadrado: ");
		l = input.nextDouble();

		System.out.println("Digite o valor de R para a �rea do Circulo: ");
		r = input.nextDouble();

		quadrado = (l * l); // �rea do quadrado > A = L�

		circulo = Math.PI * (r * r); // �rea do circulo > A = Pi * r�

		if (quadrado > circulo) {
			System.out.println("O quadrado � maior que o Circulo");
		} else {
			System.out.println("O circulo � maior que o quadrado");
		}
		input.close();

	}

}
