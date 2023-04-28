
/*Neste exercício, você escreverá métodos que retornam valores para os seguintes cenários:

1.	Converte a temperatura fornecida de Fahrenheit para Celsius.

Fórmula:
C=5/9*(F-32)
 
 */
import java.util.Scanner;

class exer01_09 {
    public static void main(String[] args) {
        // Declarção das variavies;
        float F;
        Float C;
        // Declarando objeto do Scanner:
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual a temperatura em Fahrenheit? ");
        F = teclado.nextFloat();
        C = calculoFC(F);
        System.out.printf("A temperatura em graus celsius é: %.0f", (C));
        System.out.println("°C");

    }

    static float calculoFC(float F) {
        float C_temp;
        C_temp = 5 * ((F - 32) / 9);

        return C_temp;

    }
}