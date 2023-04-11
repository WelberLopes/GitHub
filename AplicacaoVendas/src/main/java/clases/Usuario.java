
package clases;

/**
 *
 * @author deuna
 */
public class Usuario {
    private String idUsuario;
     private String nome;
      private String sobrenome;
       private String senha;
       private String perfil;

    public Usuario(String idUsuario, String nome, String sobrenome, String senha, String perfil) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
       
    
}
