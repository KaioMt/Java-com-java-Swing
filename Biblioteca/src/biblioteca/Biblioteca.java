/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author joaop
 */
public class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }
    
    public ArrayList<Emprestimo> getEmprestimos() {
    return emprestimos;
}

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
        System.out.println("Livro Adicionado");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro); // agora vai chamar o toString()
            }
        }
    }

    public void removerLivro(String titulo) {
        Livro livroParaRemover = null;
        for (Livro atual : this.livros) {
            if (atual.getNome().equalsIgnoreCase(titulo)) {
                livroParaRemover = atual;
                break;
            }
        }

        if (livroParaRemover != null) {
            if (livroParaRemover.isDisponivel()) {
                this.livros.remove(livroParaRemover);
                System.out.println("Livro removido: " + titulo);
            } else {
                System.out.println("O livro está emprestado e não pode ser removido!");
            }
        } else {
            System.out.println("Livro não encontrado!");
        }

    }

    public void editarLivro(Livro livro) {
        boolean encontrado = false;
        for (Livro atual : this.livros) {
            if (atual.getISBN() == livro.getISBN()) {
                atual.setAutor(livro.getAutor());
                atual.setNome(livro.getNome());
                System.out.println("Livro alterado!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Livro não encontrado!");
        }
    }

    public void registrarEmprestimo(Emprestimo emprestimo) {
        Livro livro = emprestimo.getLivro();

        if (livro.isDisponivel()) {
            this.emprestimos.add(emprestimo);
            livro.setDisponivel(false); // marca como emprestado
            System.out.println("Empréstimo realizado!");
        } else {
            System.out.println("Esse livro não está disponível!");
        }
    }

public void listarEmprestimos() {
    if (this.emprestimos.isEmpty()) {
        System.out.println("Ainda não há empréstimos cadastrados!");
        return;
    }

    System.out.println("=== Lista de empréstimos pendentes ===");
    for (Emprestimo atual : this.emprestimos) {
        if (atual.getDataDevolucao() == null) { // empréstimos pendentes
            System.out.println(atual);
        }
    }

    System.out.println("\n=== Lista de empréstimos devolvidos ===");
    for (Emprestimo atual : this.emprestimos) {
        if (atual.getDataDevolucao() != null) { // empréstimos devolvidos
            System.out.println(atual);
        }
    }
}

    public void devolverEmprestimo(Emprestimo emprestimo) {
        if (this.emprestimos.contains(emprestimo)) {
            emprestimo.setDataDevolucao(new Date());
            emprestimo.getLivro().setDisponivel(true);
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Esse empréstimo não existe!");
        }
    }

}
