/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicho;

/**
 *
 * @author Dimossauro
 */
public class Animal {
    
    private String Nome;
    private String Familia;
    private String Classe;
    
    private int idade;
    private int caloria;
    private int força;
    
    private boolean estado;

    public Animal(String Nome, String Familia, String Classe) {
        this.Nome = Nome;
        this.Familia = Familia;
        this.Classe = Classe;
        this.idade = 0;
        this.caloria = 10;
        this.força = 10;
        this.estado = true;
    }
    
    public void comer(){
        if(this.caloria < 100 & this.força >= 2 & this.estado == true){
            this.caloria = this.caloria + 10;
            this.força = this.força - 2;
        }
        else{
            System.out.println("Animal não pode comer pois está sem força ou está sem caloria.");
        }
    }
    
    public void correr(){
        if(this.estado == true & this.caloria >= 5 & this.força >= 5){
            this.caloria = this.caloria - 5;
            this.força = this.força = 5; 
        }
    }
    
    public void dormir(){
        if(this.estado == true & this.caloria >= 2){
            this.força = this.força + 10;
            this.caloria = this.caloria - 2;
        }
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getFamilia() {
        return Familia;
    }

    public void setFamilia(String Familia) {
        this.Familia = Familia;
    }

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String Classe) {
        this.Classe = Classe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCaloria() {
        return caloria;
    }

    public void setCaloria(int caloria) {
        this.caloria = caloria;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void morrer (){
        this.força = 0;
        this.estado = false;
    }
    
}
