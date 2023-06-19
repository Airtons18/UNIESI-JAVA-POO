/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contascorentes;

public class ContasCorrentes {

    public int conta;
    public int agencia;
    public double saldo;
    public String nome;
    public static double cpmf; //Metodo estático

    //Metodos
    public void efetuarSaque(double valor) {
        this.saldo = this.saldo - valor;
    }

    public void efetuarDeposito(double valor) {
        this.saldo = this.saldo + valor;
    }

}
