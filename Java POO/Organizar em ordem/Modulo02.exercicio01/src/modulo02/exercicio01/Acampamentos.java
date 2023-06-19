/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo02.exercicio01;

/**
 *
 * @author Uniesi
 */
public class Acampamentos {
    private String nome;
    private char equipe;
    private int idade;



    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the equipe
     */
    public char getEquipe() {
        return equipe;
    }

    /**
     * @param equipe the equipe to set
     */
    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Acampamentos(String nome, char equipe, int idade) {
        this.nome = nome;
        this.equipe = equipe;
        this.idade = idade;
    }
    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Equipe: "+this.equipe);
        System.out.println("Idade: "+this.idade);
    }
    
    public void separarGrupo(){
        if ((this.idade >= 6) && (this.idade <= 10)){
            this.equipe = 65;
        }
    }
}
