import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        String nome;
		double salario, comissao, salariofinal,vendas;
		
		System.out.println("Digite seu nome: ");
		nome = input.next();
		
		System.out.println("Digite seu sal�rio: ");
		salario = input.nextDouble();

		System.out.println("Digite o total de vendas no m�s: ");
		vendas = input.nextInt();

		comissao = (vendas * 0.15);
		salariofinal = (comissao + salario);

		System.out.println( nome + ", total a receber esse m�s: R$" + salariofinal);
		
		input.close();

	}

}
