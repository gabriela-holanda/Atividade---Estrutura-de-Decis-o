import java.util.Scanner;
public class q1{
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)){

        System.out.println("Digite seu salário:");
        double salario = input.nextDouble ();
        double salario1 = salario*0.20;
        double salario2 = salario*0.15;
        double salario3 = salario*0.10;
        double salario4 = salario*0.05;

        if (salario <= 280){
        System.out.println("Seu salário antigo era:" + salario);
        System.out.println("O percentual de aumento é 20%.");
        System.out.println("O aumento em reais é:" + salario1);
        System.out.println("O salário novo é:" + (salario + salario1));}
            else if (salario > 280 && salario <= 700) {
                System.out.println("Seu salário antigo era:" + salario);
                System.out.println("O percentual de aumento é 15%.");
                System.out.println("O aumento em reais é:" + salario2);
                System.out.println("O salário novo é:" + (salario + salario2));}
                    else if (salario > 700 && salario <= 1500) {
                        System.out.println("Seu salário antigo era:" + salario);
                        System.out.println("O percentual de aumento é 10%.");
                        System.out.println("O aumento em reais é:" + salario3);
                        System.out.println("O salário novo é:" + (salario + salario3));}
                            else {
                                System.out.println("Seu salário antigo era:" + salario);
                                System.out.println("O percentual de aumento é 5%.");
                                System.out.println("O aumento em reais é:" + salario4);
                                System.out.println("O salário novo é:" + (salario + salario4));}
            input.close();
            }
        }
    }