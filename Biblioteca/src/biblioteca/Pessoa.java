/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author joaop
 */
abstract class Pessoa {
        
    protected String Nome;
    protected String CPF;
    protected int idade;
    
    public Pessoa(String Nome, String CPF, int idade) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    abstract void cadastrarPessoa(Pessoa pessoa);
    abstract void editarrPessoa(Pessoa pessoa);
    abstract void listarPessoas(Pessoa pessoa);
}
