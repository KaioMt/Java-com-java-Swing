package Banco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = null;
        int op = 0;
        Banco conta = null;

        try {
            sc = new Scanner(System.in);

            // Criação da conta com entrada do usuário
            System.out.println("Criação da Conta");
            System.out.print("Digite o numero da conta: ");
            int numeroConta = Integer.parseInt(sc.nextLine());

            System.out.print("Digite a agência: ");
            int numeroAgencia = Integer.parseInt(sc.nextLine());

            System.out.print("Digite o nome da agência: ");
            String nomeAgencia = sc.nextLine();

            System.out.print("Digite o numero do banco: ");
            int numeroBanco = Integer.parseInt(sc.nextLine());

            System.out.print("Digite o nome do banco: ");
            String nomeBanco = sc.nextLine();

            System.out.print("Digite o tipo da conta (1=corrente, 2=poupança, 3=conjunta): ");
            int tipoConta = Integer.parseInt(sc.nextLine());

            conta = new Banco(numeroConta, numeroAgencia, nomeAgencia, numeroBanco, nomeBanco, tipoConta);

            while (op != 5) {
                System.out.println("\nMENU ");
                System.out.println("1 - Creditar");
                System.out.println("2 - Debitar");
                System.out.println("3 - Consultar Saldo");
                System.out.println("4 - Encerrar Conta");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opção: ");

                try {
                    op = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Digite um número de 1 a 5.");
                    continue;
                }

                switch (op) {
                    case 1:
                        if (conta.getTipo() == 4) {
                            System.out.println("Erro: Conta já está encerrada.");
                            op = 5;
                            break;
                        }
                        System.out.print("Digite o valor a creditar: ");
                        double valorCredito = Double.parseDouble(sc.nextLine());
                        conta.creditar(valorCredito);
                        System.out.println("Novo saldo: R$ " + conta.getSaldo());
                        break;

                    case 2:
                        if (conta.getTipo() == 4) {
                            System.out.println("Erro: Conta já está encerrada.");
                            op = 5;
                            break;
                        }
                        if(conta.getConta() <= 0){
                            System.out.println("Saldo insuficiente!!");
                            break;
                        }
                        System.out.print("Digite o valor a debitar: ");
                        double valorDebito = Double.parseDouble(sc.nextLine());
                        conta.debitar(valorDebito);
                        System.out.println("Seu novo saldo:  " + conta.getSaldo());
                        break;

                    case 3:
                        System.out.println("Seu saldo atual: " + conta.getSaldo());
                        break;

                    case 4:
                        if (conta.getSaldo() < 0) {
                            System.out.println("Erro: Conta com saldo negativo não pode ser encerrada.");
                        } else {
                            conta.encerrarConta();
                            System.out.println("\n=== Conta Encerrada ===");
                            System.out.println("Numero da Conta: " + conta.getConta());
                            System.out.println("Tipo da Conta: " + conta.getTipo());
                            System.out.println("Saldo final: " + conta.getSaldo());

                            op = 5;
                        }
                        break;

                    case 5:
                        System.out.println("Encerrando o sistema bancário...");
                        break;

                    default:
                        System.out.println("Opção inválida. Escolha de 1 a 5.");
                }
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
