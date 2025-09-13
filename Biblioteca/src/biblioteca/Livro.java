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
public class Livro {

    protected String nome;
    protected int ISBN;
    protected String Autor;

    private boolean disponivel = true;

    public Livro(String Nome, int ISBN, String Autor) {
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.nome = Nome;
    }

    public String getNome() {
        return nome;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
    @Override
    public String toString() {
        return "Livro:" +
                "Título='" + nome + '\'' +
                ", Autor='" + Autor + '\'' +
                ", ISBN=" + ISBN ;
    }
    
}
