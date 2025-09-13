/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animais;

/**
 *
 * @author joaop
 */

abstract class Animais {
    protected String Nome;
    protected int Idade;
    protected String Cor;
    
    public Animais (String nome, int idade, String cor){
        this.Nome = nome;
        this.Idade = idade;
        this.Cor = cor;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setIdade(int idade) {
        this.Idade = idade;
    }

    public void setCor(String cor) {
        this.Cor = cor;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public String getCor() {
        return Cor;
    }
  
    abstract void EmitirSom();
}
