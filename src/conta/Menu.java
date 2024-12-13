package conta;

import java.util.Scanner;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {
	public static void main(String[] args) {
		
		// Instância da Classe ContaCorrente
		/*ContaCorrente cc2 = new ContaCorrente(1, 34, 1, "Francisco", 500.0f, 1000.0f);
		cc2.visualizar();*/
		
		// Instância da Classe ContaCorrente com limite fixo
		ContaCorrente cc3 = new ContaCorrente(3, 12345, 1, "João", 1000.0f);
		
		// Instanciamento | Classe -> Objeto Utilizável
		/*Conta c1 = new Conta(123456, 0001, 1, "Maria das Neves", 500f);
		c1.setSaldo(5000f);
		
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Saldo: " + c1.getSaldo());*/
		
		// Teste da Classe Conta Corrente
				ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
				cc1.visualizar();
				cc1.sacar(12000.0f);
				cc1.visualizar();
				cc1.depositar(5000.0f);
				cc1.visualizar();
				
		        // Teste da Classe Conta Poupança
				ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
				cp1.visualizar();
		        cp1.sacar(1000.0f);
				cp1.visualizar();
				cp1.depositar(5000.0f);
				cp1.visualizar();

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  BANCO DO CAPITAL                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Capital - Seu dinheiro bem guardado.");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Marcos Iyama - marcosiyama@gmail.com");
		System.out.println("github.com/MarcosIyama");
		System.out.println("*********************************************************");
	}
}