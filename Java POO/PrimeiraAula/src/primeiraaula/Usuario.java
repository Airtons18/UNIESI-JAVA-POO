
package primeiraaula;

import java.util.Scanner;

public class Usuario {
    private String nome;
    private String email;
    private String login;
    private String senha;
    private String seila;
    
    //Construtor
    //Vazios
    
    public Usuario(){
        
    }
    //Inicializa atributos com valores pasado pelos parâmetros
    public Usuario(String nome, String email, String login, String senha, String seila) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.seila = seila;
    }

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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the seila
     */
    public String getSeila() {
        return seila;
    }

    /**
     * @param seila the seila to set
     */
    public void setSeila(String seila) {
        this.seila = seila;
    }
    
    
    public void provarExistencia() {
        System.out.println("Oi " +this.nome + ", você existe !");
    }
    
    public void logar() {
        Scanner myUser = new Scanner(System.in);
        System.out.println("Entre com usuario: ");
        String userName = myUser.nextLine();
        Scanner myPass = new Scanner(System.in);
        System.out.println("Entre com a senha: ");
        String userSenha = myPass.nextLine();
        /*System.out.println("var userName: "+userName);
        System.out.println("var getLogin(): "+getLogin()); */
        
        if (getLogin().equals(userName)){
            if (getSenha().equals(userSenha))
            System.out.println("Login Efetuado com Sucesso  !!!!!!!!!!");
    }
    }
}
