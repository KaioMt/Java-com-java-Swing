/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Banco;

/**
 *
 * @author Guilherme
 */
public class Banco {

    private int Conta;
    private int nAgencia;
    private String nameAgencia;
    private int numBanco;
    private String nameBanco;
    private int tipo; // 1 = corrente, 2 = poupança, etc.
    private double saldo;

    // Construtor padrão
    public Banco() {
    }

    // Construtor personalizado
    public Banco(int numeroConta, int numeroAgencia, String nomeAgencia,
            int numeroBanco, String nomeBanco, int tipo) {
        this.nAgencia = numeroConta;
        this.nAgencia = numeroAgencia;
        this.nameAgencia = nomeAgencia;
        this.numBanco = numeroBanco;
        this.nameBanco = nomeBanco;
        this.tipo = tipo;
        this.saldo = 0.0;
    }

    // Getters
    public int getConta() {
        return Conta;
    }
    public int getNumBanco() {
        return numBanco;
    }
    public int getnAgencia() {
        return nAgencia;
    }
    public String getNameAgencia() {
        return nameAgencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getTipo() {
        return tipo;
    }

    //seters
    public void setConta(int Conta) {
        this.Conta = Conta;
    }
    public String getNameBanco() {
        return nameBanco;
    }
    public void setnAgencia(int nAgencia) {
        this.nAgencia = nAgencia;
    }
    public void setNameAgencia(String nameAgencia) {
        this.nameAgencia = nameAgencia;
    }
    public void setNumBanco(int numBanco) {
        this.numBanco = numBanco;
    }
    public void setNameBanco(String nameBanco) {
        this.nameBanco = nameBanco;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos
    public void creditar(double valor) {
        if (tipo != 4) {
            saldo += valor;
        } else {
            System.out.println("Conta encerrada. Não é possível creditar.");
        }
    }

    public void debitar(double valor) {
        if (tipo != 4) {
            saldo -= valor;
        } else {
            System.out.println("Conta encerrada. Não é possível debitar.");
        }
    }

    public int encerrarConta() {
        tipo = 4;
        double saldoFinal = saldo;
        saldo = 0;
        return tipo;
    }
}
