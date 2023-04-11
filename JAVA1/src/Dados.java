package com.lopes.aplicacaovendas;

public class Dados {
    public boolean validarUsuario(String usuario, String senha){
      if (usuario.equals("sani")&& senha.equals("12345")){
        return true;
      }else{ 
        return false;
    }
}
}