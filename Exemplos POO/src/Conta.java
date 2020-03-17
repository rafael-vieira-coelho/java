/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author coelho
 */
public class Conta {
    //Estado (Atributos)
    private String cliente;
    private int cpf;
    private double saldo;
    private boolean cheque_especial;

    //construtor
    public Conta(String nome, int cpf, double saldo) {
        this.cliente = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.cheque_especial = false;
    }

    public Conta() {
        this.saldo = 0;
        this.cheque_especial = false;
    }

    //get e set
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isCheque_especial() {
        return cheque_especial;
    }

    public void setCheque_especial(boolean cheque_especial) {
        this.cheque_especial = cheque_especial;
    }

    //Comportamento (Ações)
    public void creditar(double valor) {
        saldo = saldo + valor;
    }

    public void creditar() {
        saldo = saldo + 10;
    }

    public String verificeCredor() {
        if (cheque_especial) {
            return "Ta fudido...";
        }
        return "Caro cliente, você não quer entrar no cheque especial";
    }

    public boolean debitar(double valor) {
        if (saldo - valor >= 0) {
            saldo = saldo - valor;
            return true;
        }
        if (saldo - valor + 100 >= 0) {
            saldo = saldo - valor;
            cheque_especial = true;
            return true;
        }
        return false;
    }
}
