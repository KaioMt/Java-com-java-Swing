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
public class Funcionario extends Pessoa {

    ArrayList<Pessoa> Funcionarios;

    public Funcionario(String Nome, String CPF, int idade) {
        super(Nome, CPF, idade);
    }

    @Override
    void cadastrarPessoa(Pessoa funcionario) {
        this.Funcionarios.add(funcionario);
    }

    @Override
    void editarrPessoa(Pessoa funcionario) {
        boolean encontrado = false;
        for (Pessoa Atual : Funcionarios) {
            if (Atual.getCPF().equals(funcionario.getCPF())) {
                Atual.setNome(funcionario.getNome());
                Atual.setIdade(funcionario.getIdade());
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
    void listarPessoas(Pessoa funcionario) {
        for(Pessoa Atual: Funcionarios){
            System.out.println("Nome: " + Atual.getNome()
                    + ",CPF: " + Atual.getCPF() 
                    + ",Idade: " + Atual.getIdade());
        }

    }

}
