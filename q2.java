import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){

        System.out.println("Digite quanto você recebe por hora:");
        double vph = input.nextDouble();
        System.out.println("Digite quantas horas você trabalha no mês:");
        double horas = input.nextDouble();

        double sabr = vph * horas;
        double sabr1 = sabr * 0.05;
        double sabr2 = sabr * 0.10;
        double sabr3 = sabr * 0.20;

        if (sabr <= 1518) {
            System.out.println("Seu salário bruto é:" + sabr);
            System.out.println("Seu desconto é de 0%.");
        } else if (sabr >= 2700) {
            System.out.println("Seu salário bruto é:" + sabr);
            System.out.println("Seu desconto é de 5%.");
            System.out.println("O valor do desconto é:" + sabr1);
            System.out.println("O valor com desconto é:" + (sabr - sabr1));
        } else if (sabr >= 3400) {
            System.out.println("Seu salário bruto é:" + sabr);
            System.out.println("Seu desconto é de 10%.");
            System.out.println("O valor do desconto é:" + sabr2);
            System.out.println("O valor com desconto é:" + (sabr - sabr2));
        } else {
            System.out.println("Seu salário bruto é:" + sabr);
            System.out.println("Seu desconto é de 20%.");
            System.out.println("O valor do desconto é:" + sabr3);
            System.out.println("O valor com desconto é:" + (sabr - sabr3));
        }
        input.close();
        }
    }
}
