import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class App {
    public static void main(String[] args) throws Exception {
        double capacidadeLatas = 18;
        double capacidadegalao = 3.6;
        double precogalão = 25.00;
        double precolata = 80.00;
        double rendimento = 6;
        double m2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a metragem a metragem a ser coberta em m3: ");

        m2 = sc.nextDouble();

        double qtdLatas = m2 / (capacidadeLatas * rendimento);
        double ValorTotalLatas = qtdLatas * precolata;
        double qtdgaloes = m2 / (capacidadegalao * rendimento);
        double ValortotalGaloes = qtdgaloes * precogalão;

        double m2Mistura = m2 * 1.1;

        System.out.printf("A quantidade de latas a serem utilizadas será %f latas e custará %f reais.", qtdLatas,
                ValorTotalLatas);
        System.out.printf("\n" + "A quantidade de galões a serem utilizados será %f  e custará %f reais.", qtdgaloes,
                ValortotalGaloes);

    }
}
