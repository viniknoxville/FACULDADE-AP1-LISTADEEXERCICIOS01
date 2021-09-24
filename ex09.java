
import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int cad; 
		double val, sal, hor;

		System.out.println("Olá, digite o número do seu cadastro: ");
		cad = input.nextInt();

		System.out.println("Digite o número de horas trabalhadas: ");
		hor = input.nextDouble();

		System.out.println("Digite o valor que ganha por hora: ");
		val = input.nextDouble();

		sal = (val * hor); // salário = (hora * valor hora)

		System.out.println("Funcionário: " + cad + "\n" + "Sálario: R$ " + sal);
		input.close();
	}

}
