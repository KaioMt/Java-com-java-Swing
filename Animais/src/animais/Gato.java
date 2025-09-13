/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais;

/**
 *
 * @author joaop
 */
public class Gato extends Animais{

    public Gato(String nome, int idade, String cor) {
        super(nome,idade, cor);
    }
    
    @Override
    public void EmitirSom() {
        System.out.println("Nome: " + Nome + ", " + "Idade: " + Idade + ", " + "Cor: " + Cor + ", " + "Som: " + "Miar");
    }
}
