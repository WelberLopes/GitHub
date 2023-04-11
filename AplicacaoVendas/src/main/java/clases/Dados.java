package clases;


public class Dados {
     private Usuario msUsuarios[] = new Usuario[50];
     private int contUser = 0;
     
     public Dados (){
         Usuario mUser = new Usuario("san", "San1", "san2", "12345", 1);
         msUsuarios[contUser] = mUser;
     }
    public boolean validarUsuario(String usuario, String senha){
      if (usuario.equals("sani")&& senha.equals("12345")){
       boolean aux = false;
       for(int i= 0; i <contUser; i++){
           if (msUsuarios[i].getIdUsuario().equals(usuario))&&
                   msUsuarios[i].getSenha).equals(senha)){
           return true;     
       } 
       } 
       return false;
}
}