/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo01.ex01;

/**
 *
 * @author Uniesi
 */
public class Apolices {
    private String nomeSegurado;
    private String idade;
    private float valorPremio;

    /**
     * @return the nomeSegurado
     */
    public String getNomeSegurado() {
        return nomeSegurado;
    }

    /**
     * @param nomeSegurado the nomeSegurado to set
     */
    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    /**
     * @return the idade
     */
    public String getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(String idade) {
        this.idade = idade;
    }

    /**
     * @return the valorPremio
     */
    public float getValorPremio() {
        return valorPremio;
    }

    /**
     * @param valorPremio the valorPremio to set
     */
    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }
    
    public void imprimir() {
        System.out.println("Nome Segurado: "+nomeSegurado);
        System.out.println("Idade: "+idade);
        System.out.println("Valor Premio:"+valorPremio);
    }
}


