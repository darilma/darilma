package projeto;

import java.util.Scanner;

public class Menu {

	public static void menuAgenda() {
		System.out.println("\nBem Vindo a Agenda de Contatos o que deseja fazer ");
		System.out.println("1. Adicionar Contato");
		System.out.println("2. Listar Contato");
		System.out.println("3. Buscar Contato");
		System.out.println("4. Editar Contato");
		System.out.println("5. Remover Contato");
		System.out.println("0. Sair");
		System.out.println("Opcao escolhida:");
	}

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		int opcao, i;

		Scanner entrada = new Scanner(System.in);
		Agenda ag = new Agenda();

		do {
			menuAgenda();
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1: {// feito e rodando
				System.out.println("Adicionar");

				Contato c = new Contato();
				System.out.print("Digite o nome:");
				c.setNome(entrada.next());

				System.out.print("Digite o Telefone:");
				c.setTelefone(entrada.nextInt());

				System.out.print("Digite o Email:");
				c.setEmail(entrada.next());

				ag.adicionarContato(c);
				break;
			}

			case 2: {// feito e rodando
				System.out.println("Listar Contato.");
				System.out.println(ag.listarContato(null));
				break;
			}

			case 3: {// feito e rodando
				System.out.println("Buscar Contato.");
				System.out.printf("Informe o nome do Contato que deseja bucar:\n");
				String nome = entrada.next();

				System.out.println("Buscando Contato***************************.");
				Contato contato = new Contato();

				contato = ag.buscarContato(nome);

				if (contato == null) {
					System.out.println(" Contato não encontrado.");
				} else {
					System.out.println(ag.buscarContato(nome));
				}
				break;
			}

			case 4: {
				System.out.println("Editar Contato.");
				entrada = new Scanner(System.in);
				System.out.printf("Informe o nome a ser editado:\n");
				String nome = entrada.next();

				Contato contato = ag.buscarContato(nome);

				System.out.println("Digite o novo nome:");
				contato.setNome(entrada.next());

				System.out.println("Digite o novo Telefone:");
				contato.setTelefone(entrada.nextInt());

				System.out.println("Digite o novo  Email:");
				contato.setEmail(entrada.next());

				System.out.println("Contato depois de editado");
				ag.editarContato(contato);
				break;
			}

			case 5: {// feito e rodando
				System.out.println("Remover Contato.");
				entrada = new Scanner(System.in);
				System.out.printf("Informe o nome do contato a ser excluido:\n");
				String nome = entrada.next();

				Contato contato = ag.buscarContato(nome);

				ag.removeContato(contato);
				System.out.println("Contato " + nome + " removido com sucesso: \n");

				System.out.println("lista atualizada apos exlusao do contato");
				System.out.println(ag.listarContato(null));
				break;
			}

			case 0: {
				System.out.println(" Programa Finalizado: ");
				break;
			}
			default:
				System.out.println(" Opcao Invalida");
				break;
			}

		} while (opcao != 0);
	}
}
