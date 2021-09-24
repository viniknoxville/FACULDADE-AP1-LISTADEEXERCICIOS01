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

		tr = ((a * c) / 2); // área do triângulo retângulo > A = (b*h)/2

		ci = Math.PI * (c * c); // área do circulo > A = Pi * r²

		tra = (c * (a + b)) / 2; // área trapézio > A = (h * (b+B))/2

		qua = (b * b); // área do quadrado > A = L²

		ret = (a * b); // área retângulo > A = b * h

		retpe = 2 * (a + b); // perímetro retângulo > P = 2(b+h)

		System.out.println("Área do triângulo retângulo onde, A por base C por Altura: " + tr + "\n");

		System.out.println("Área do circulo onde, C é o raio: " + ci + "\n");

		System.out.println("Área do trapézio onde, A e B por bases e C por Altura: " + tra + "\n");

		System.out.println("Área do quadrado que tem lado B: " + qua + "\n");

		System.out.println("Área do retângulo que tem lado A e B: " + ret + "\n");

		System.out.println("Perímetro do retângulo que tem lado A e B: " + retpe + "\n");

		input.close();
	}

}
