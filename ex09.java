
import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int cad; 
		double val, sal, hor;

		System.out.println("Ol�, digite o n�mero do seu cadastro: ");
		cad = input.nextInt();

		System.out.println("Digite o n�mero de horas trabalhadas: ");
		hor = input.nextDouble();

		System.out.println("Digite o valor que ganha por hora: ");
		val = input.nextDouble();

		sal = (val * hor); // sal�rio = (hora * valor hora)

		System.out.println("Funcion�rio: " + cad + "\n" + "S�lario: R$ " + sal);
		input.close();
	}

}
