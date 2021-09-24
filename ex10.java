import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        String nome;
		double salario, comissao, salariofinal,vendas;
		
		System.out.println("Digite seu nome: ");
		nome = input.next();
		
		System.out.println("Digite seu salário: ");
		salario = input.nextDouble();

		System.out.println("Digite o total de vendas no mês: ");
		vendas = input.nextInt();

		comissao = (vendas * 0.15);
		salariofinal = (comissao + salario);

		System.out.println( nome + ", total a receber esse mês: R$" + salariofinal);
		
		input.close();

	}

}
