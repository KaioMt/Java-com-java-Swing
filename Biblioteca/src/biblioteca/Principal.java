package biblioteca;

import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Gerenciadores separados
        Membro gerMembros = new Membro("", "", 0);
        Funcionario gerFuncionarios = new Funcionario("", "", 0);
        Biblioteca biblioteca = new Biblioteca();

        int opcaoPrincipal;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Gerenciar Membros");
            System.out.println("2 - Gerenciar Funcionários");
            System.out.println("3 - Gerenciar a Biblioteca");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoPrincipal = sc.nextInt();
            sc.nextLine();

            switch (opcaoPrincipal) {
                case 1:
                    menuPessoas(sc, gerMembros, "Membro");
                    break;
                case 2:
                    menuPessoas(sc, gerFuncionarios, "Funcionário");
                    break;
                case 3:
                    menuBiblioteca(sc, biblioteca);
                    break;
                case 4:
                    System.out.println("Saindo... até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcaoPrincipal != 4);

        sc.close();
    }

    // Método auxiliar que funciona para Membros e Funcionários
    private static void menuPessoas(Scanner sc, Pessoa gerenciador, String tipo) {
        int opcao;
        do {
            System.out.println("\n===== MENU " + tipo.toUpperCase() + " =====");
            System.out.println("1 - Cadastrar " + tipo);
            System.out.println("2 - Editar " + tipo);
            System.out.println("3 - Listar " + tipo + "s");
            System.out.println("4 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    if (gerenciador instanceof Membro) {
                        ((Membro) gerenciador).cadastrarPessoa(new Membro(nome, cpf, idade));
                    } else if (gerenciador instanceof Funcionario) {
                        ((Funcionario) gerenciador).cadastrarPessoa(new Funcionario(nome, cpf, idade));
                    }
                    break;

                case 2:
                    System.out.print("Digite o CPF da pessoa a editar: ");
                    String cpfEdit = sc.nextLine();
                    System.out.print("Digite o novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Digite a nova idade: ");
                    int novaIdade = sc.nextInt();
                    sc.nextLine();

                    if (gerenciador instanceof Membro) {
                        ((Membro) gerenciador).editarrPessoa(new Membro(novoNome, cpfEdit, novaIdade));
                    } else if (gerenciador instanceof Funcionario) {
                        ((Funcionario) gerenciador).editarrPessoa(new Funcionario(novoNome, cpfEdit, novaIdade));
                    }
                    break;

                case 3:
                    gerenciador.listarPessoas(null);
                    break;

                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);
    }

    public static void menuBiblioteca(Scanner sc, Biblioteca biblioteca) {
        int opcao;

        do {
            System.out.println("\n=== MENU BIBLIOTECA ===");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Registrar Empréstimo");
            System.out.println("4 - Listar Empréstimos");
            System.out.println("5 - Devolver Livro");
            System.out.println("6 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Título do livro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("ISBN: ");
                    int isbn = sc.nextInt();
                    sc.nextLine();

                    biblioteca.adicionarLivro(new Livro(titulo, isbn, autor));
                    break;

                case 2:
                    biblioteca.listarLivros();
                    break;

                case 3:
                    System.out.print("Título do livro: ");
                    String livroEmp = sc.nextLine();
                    System.out.print("Nome da pessoa: ");
                    String pessoa = sc.nextLine();

                    Livro livroParaEmprestimo = null;
                    for (Livro l : biblioteca.getLivros()) {
                        if (l.getNome().equalsIgnoreCase(livroEmp)) {
                            livroParaEmprestimo = l;
                            break;
                        }
                    }

                    if (livroParaEmprestimo != null) {
                        biblioteca.registrarEmprestimo(
                                new Emprestimo(livroParaEmprestimo, pessoa, new Date(), null)
                        );
                    } else {
                        System.out.println("Livro não encontrado!");
                    }
                    break;

                case 4:
                    biblioteca.listarEmprestimos();
                    break;

                case 5:
                    System.out.print("Título do livro a devolver: ");
                    String tituloDevolver = sc.nextLine();

                    Emprestimo emprestimoParaDevolver = null;
                    for (Emprestimo e : biblioteca.getEmprestimos()) {
                        if (e.getLivro().getNome().equalsIgnoreCase(tituloDevolver)
                                && e.getDataDevolucao() == null) {
                            emprestimoParaDevolver = e;
                            break;
                        }
                    }

                    if (emprestimoParaDevolver != null) {
                        biblioteca.devolverEmprestimo(emprestimoParaDevolver);
                    } else {
                        System.out.println("Empréstimo não encontrado ou livro já devolvido!");
                    }
                    break;

                case 6:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

}
