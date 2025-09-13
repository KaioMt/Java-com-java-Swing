/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicho;

import java.util.Scanner;
import javax.swing.SwingConstants;

/**
 *
 * @author Dimossauro
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int op = 0;

        try {
            System.out.println("===Crie um nome animal===");

            System.out.println("Digite o nome dele:");
            String nome = scan.nextLine();

            System.out.println("Digite a qual familia ele pertence:");
            String familia = scan.nextLine();

            System.out.println("Dite de qual calsse ele é:");
            String classe = scan.nextLine();

            Animal bicho = new Animal(nome, familia, classe);

            while (op != 4) {
                System.out.println("O que seu bichinho irá fazer ?");
                System.out.println("DIgite 0 para ver o status do " + bicho.getNome());
                System.out.println("Digite 1 para comer");
                System.out.println("Digite 2 para correr");
                System.out.println("Digite 3 para dormir");
                System.out.println("Digite 4 para sair(vai matar o bichinho)");

                if (scan.hasNextInt()) {
                    op = scan.nextInt();
                    scan.nextLine();
                } else {
                    System.out.println("Opção inválida! Você não digitou um numero!");
                    scan.next();
                    continue;
                }

                switch (op) {
                    case 0 :
                        System.out.println("Status do seu bichinho:");
                        System.out.println("Familia: " + bicho.getFamilia());
                        System.out.println("Classe: " + bicho.getClasse());
                        System.out.println("Idade: " + bicho.getIdade());
                        System.out.println("Caloria: " + bicho.getCaloria());
                        System.out.println("Força: " + bicho.getForça());
                        break;
                    case 1:
                        bicho.comer();
                        System.out.println("nhac nhac que gostosinha :)");
                        break;
                    case 2:
                        bicho.correr();
                        System.out.println("Nu cansei Zé, '-'");
                        break;
                    case 3:
                        bicho.dormir();
                        System.out.println("Aiai, que soninho zzzz");
                        bicho.setIdade(bicho.getIdade() + 1);
                        break;
                    case 4:
                        bicho.morrer();
                        System.out.println("Morri");
                        System.out.println("Você matou o bichinho, coitado ;-;");
                        break;
                    default:
                        System.out.println("Não existe essa opção para seu animal, é só entre o 1 e o 4");
                }

            }
        } catch (Exception err) {
            System.out.println("Ocorreu o seguinte erro: " + err);
        }finally{
            scan.close();
            System.out.println("Sistema encerrado");
        }

    }

}
