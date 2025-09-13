/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class Membro extends Pessoa {

    ArrayList<Pessoa> Membros;

    public Membro(String Nome, String CPF, int idade) {
        super(Nome, CPF, idade);
        Membros = new ArrayList<>();
    }

    @Override
    void cadastrarPessoa(Pessoa membro) {
        this.Membros.add(membro);
        System.out.println("Membro cadastrado: " + membro.getNome());
    }

    @Override
    void editarrPessoa(Pessoa membro) {
        boolean encontrado = false;
        for (Pessoa atual : Membros) {
            if (atual.getCPF().equals(membro.getCPF())) {
                atual.setNome(membro.getNome());
                atual.setIdade(membro.getIdade());
                System.out.println("Membro alterado!");
                encontrado = true;
                break; // já achou, não precisa continuar
            }
        }
        if (!encontrado) {
            System.out.println("Membro não encontrado!!");
        }

    }

    @Override
    void listarPessoas(Pessoa membro) {
        for (Pessoa atual : Membros) {
                System.out.println(
                    "Nome: " + atual.getNome() +
                    ", CPF: " + atual.getCPF() +
                    ", Idade: " + atual.getIdade());
        }
    }

}
