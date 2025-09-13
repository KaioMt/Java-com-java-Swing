/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.Date;

/**
 *
 * @author joaop
 */
public class Emprestimo{

    protected String pessoa;
    protected Date dataEmprestimo;
    protected Date dataDevolucao;
    
    protected Livro livro;
    
public Emprestimo(Livro livro, String pessoa, Date dataEmprestimo, Date dataDevolucao) {
    this.pessoa = pessoa;
    this.livro = livro;
    this.dataDevolucao = dataDevolucao;
    this.dataEmprestimo = dataEmprestimo;
}

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    
    
    public void devolver(Date data){
        this.dataDevolucao = data;
        livro.setDisponivel(true);
    }
    
     @Override
    public String toString() {
        return "Livro: " + livro.getNome()+
               ", Pessoa: " + pessoa +
               ", Emprestimo: " + dataEmprestimo +
               ", Devolução: " + (dataDevolucao != null ? dataDevolucao : "Não devolvido");
    }
}
