
package primeiraaula;

public class PrimeiraAula {
    
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario ();
        usuario1.setNome("João Kleber");
        usuario1.setEmail("jk@gmail.com");
        usuario1.setLogin("admin");
        usuario1.setSenha("admin");
        
        Usuario usuario2 = new Usuario();
        usuario2.setNome("Adalmo");
        usuario2.setEmail("ad@gmail.com");
        usuario2.setLogin("adm");
        usuario2.setSenha("adm");
        
        usuario1.provarExistencia();
        usuario1.logar();
        
        usuario2.provarExistencia();
        usuario2.logar();
    }
}
