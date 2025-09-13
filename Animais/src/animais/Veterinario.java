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
public class Veterinario {
    private ArrayList<Animais> animais;
    

    public Veterinario() {
        animais = new ArrayList<>();
    }
    
    public void AdicionarAnimais(Animais animal){
        this.animais.add(animal);
    }
  
    public void percorrerLista(){
        for (Animais animal: animais){
            animal.EmitirSom();
            System.out.println(animal.getNome() + " Foi pego :(");
        }
    }
}
