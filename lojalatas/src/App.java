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
        double qtdLatasMis = m2Mistura / (capacidadeLatas * rendimento);
        double qtdLatasMisArredondada = Math.ceil(m2Mistura / (capacidadeLatas * rendimento));
        double qtddisperdicioLatas = qtdLatasMisArredondada - qtdLatasMis;
        double qtdConvertidaemGaloes = (1 - qtddisperdicioLatas) * capacidadeLatas;
        double quantidadeEmGaloesArredondada = Math.ceil(qtdConvertidaemGaloes / capacidadegalao);
        double qtdFinalmisturalata = Math.floor(qtdLatasMis);

        double ValorMisGalão = quantidadeEmGaloesArredondada * precogalão;
        double ValorMisLata = qtdFinalmisturalata * precolata;

        double valortotalMis = ValorMisGalão + ValorMisLata;

        System.out.printf("A quantidade de latas a serem utilizadas será %f latas e custará %f reais.", qtdLatas,
                ValorTotalLatas);
        System.out.printf("\n" + "A quantidade de galões a serem utilizados será %f  e custará %f reais.", qtdgaloes,
                ValortotalGaloes);
        System.out.printf(
                "\n" + "A quantidade de latas a serem utilizados  na mistura será %f  e %f  galões e custará %f reais.",
                qtdFinalmisturalata, quantidadeEmGaloesArredondada, valortotalMis);
        System.out.println("\n");
        System.out.println(qtdLatasMisArredondada);
        System.out.println(m2Mistura);
        System.out.println(qtdLatasMis);
        System.out.println(qtdFinalmisturalata);
        System.out.println(qtdConvertidaemGaloes);
        System.out.println(quantidadeEmGaloesArredondada);

    }
}
