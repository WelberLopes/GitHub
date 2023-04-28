import java.lang.reflect.Method;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class testePIN {
    public static void main(String[] args) {
        // entrada:
        int PIN = 565656;
        int PIN_DIGITADO;
        int i = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE SEU PIN DE ACESSO: ");

        PIN_DIGITADO = sc.nextInt();

        while (PIN_DIGITADO != PIN && i <= 2) {

            System.out.printf("PIN incorreto. Restam %d tentativas. Digite novamente!", 3 - i);
            System.out.println(" ");
            PIN_DIGITADO = sc.nextInt();
            i++;

        }
        if (PIN_DIGITADO == PIN) {

            System.out.println("ACESSO PERMITIVO. SEJA BEM-VINDO.");

        } else {
            System.out.println(" ACESSO BLOQUEADO APÓS 3 TENTATIVAS. ENTRE EM CONTATO COM A CENTRAL.");

        }
    }
}