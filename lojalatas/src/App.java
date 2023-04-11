import java.util.Scanner;
import java.util.function.DoubleToIntFunction;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        double capacidadeLatas = 18;
        double capacidadegalao = 3.6;
        double precogalão = 25.00;
        double precolata = 80.00;
        double rendimento = 6;
        double m2;

        DecimalFormat deci = new DecimalFormat("0");
        DecimalFormat reais = new DecimalFormat("0.00");

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

        System.out.println("A quantidade de latas a serem utilizadas será " + deci.format(qtdLatas)
                + " e custará R$" + reais.format(ValortotalGaloes));
        System.out.println("A quantidade de galões a serem utilizados será " + deci.format(qtdgaloes) + " e custará R$"
                + reais.format(ValortotalGaloes));

        System.out.println("As quantidades a serem utilizados  na mistura será "
                + deci.format(qtdFinalmisturalata) + " latas e " + deci.format(quantidadeEmGaloesArredondada)
                + " galões e custará R$" + reais.format(valortotalMis));
    }
}
