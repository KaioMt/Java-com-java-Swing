/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais;
import java.util.ArrayList;
/**
 *
 * @author joaop
 */
public class Principal {
        public static void main(String[] args) {
            Animais Cachorro = new Cachorro ("Madruga", 14,"Marrom com Preto");
            Animais Gato = new Gato ("Anubis", 6,"Preto e branco");
            Animais Cavalo = new Cavalo ("Tornado", 9,"Marrom");
            Animais Cadela = new Cachorro ("Kiara", 10,"Branca com Preto");
            
            Veterinario veterinario = new Veterinario ();
            veterinario.AdicionarAnimais(Cachorro);
            veterinario.AdicionarAnimais(Gato);
            veterinario.AdicionarAnimais(Cavalo);
            
            veterinario.percorrerLista();
            
            Cadela.EmitirSom();
            System.out.println("Kiara não foi pega!!");
    }
}
