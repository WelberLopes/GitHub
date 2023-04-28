/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clases;

import formularios.frmLogin;


/**
 *
 * @author deuna
 */
public class AplicacaoVendas {

    public static void main(String[] args) {
        Dados msDados = new Dados();        
        frmLogin miLogin = new frmLogin();
        miLogin.setDados(msDados);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
}
