import java.util.Scanner;

public class drake {
    public static void main (String [] args) {
        float R0, Fp, Ne, Fl, Fi, Fc, L, N;
        Scanner num = new Scanner(System.in);

        System.out.print(" Informe a taxa de formação das estrelas da galáxia: ");
        R0 = num.nextFloat();

        System.out.print(" Informe a quantidade dessas estrelas que têm planetas: ");
        Fp = num.nextFloat();

        System.out.print(" Informe o número médio de planetas com potencial de desenvolver vida: ");
        Ne = num.nextFloat();

        System.out.print(" Número provável de planetas que realmente desenvolvem vida: ");
        Fl = num.nextFloat();

        System.out.print(" Fração provável de planetas que desenvolve vida inteligente: ");
        Fi = num.nextFloat();

        System.out.print(" Fração provável de planetas com vida inteligente com capacidade de comunicação: ");
        Fc = num.nextFloat();

        System.out.print(" Tempo provável de vida de uma civilização: ");
        L = num.nextFloat();

        N = (R0 * Fp * Ne * Fl * Fi * Fc * L);

        System.out.println(" A resposta atual é: " + N);

    }
}