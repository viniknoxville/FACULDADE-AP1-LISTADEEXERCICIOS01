import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a, b, c, tr, ci, tra, qua, ret, retpe;

		System.out.println("Digite o valor de A: ");
		a = input.nextDouble();

		System.out.println("Digite o valor de B: ");
		b = input.nextDouble();

		System.out.println("Digite o valor de C: ");
		c = input.nextDouble();

		tr = ((a * c) / 2); // �rea do tri�ngulo ret�ngulo > A = (b*h)/2

		ci = Math.PI * (c * c); // �rea do circulo > A = Pi * r�

		tra = (c * (a + b)) / 2; // �rea trap�zio > A = (h * (b+B))/2

		qua = (b * b); // �rea do quadrado > A = L�

		ret = (a * b); // �rea ret�ngulo > A = b * h

		retpe = 2 * (a + b); // per�metro ret�ngulo > P = 2(b+h)

		System.out.println("�rea do tri�ngulo ret�ngulo onde, A por base C por Altura: " + tr + "\n");

		System.out.println("�rea do circulo onde, C � o raio: " + ci + "\n");

		System.out.println("�rea do trap�zio onde, A e B por bases e C por Altura: " + tra + "\n");

		System.out.println("�rea do quadrado que tem lado B: " + qua + "\n");

		System.out.println("�rea do ret�ngulo que tem lado A e B: " + ret + "\n");

		System.out.println("Per�metro do ret�ngulo que tem lado A e B: " + retpe + "\n");

		input.close();
	}

}
