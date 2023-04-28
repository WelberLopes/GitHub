package clases;

public class Dados {
    private Usuario msUsuarios[] = new Usuario[50];
    private int contUser = 0;

    public Dados() {
        Usuario mUser = new Usuario("San", "San", "san2", "12345", 1);
        msUsuarios[contUser] = mUser;
        contUser++;
    }

    public Usuario[] getusuarios() {
        return msUsuarios;
    }

    public boolean validarUsuario(String usuario, String senha) {
        boolean aux = false;
        for (int i = 0; i < contUser; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario) &&
                    msUsuarios[i].getSenha().equals(senha)) {
                return true;
            }
        }
        return false;

    }
}