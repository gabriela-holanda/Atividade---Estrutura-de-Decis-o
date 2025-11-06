import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){

        System.out.println("Qual tipo de combustível? (A-álcool, G-gasolina)");
        char tipo = input.next().toUpperCase().charAt(0);
        System.out.println("Quantos litros?");
        double litros = input.nextDouble();

        double precoLitro;
        double desconto;

        if (tipo == 'A'){
            precoLitro = 1.90;
            if (litros <= 25){
                desconto = 0.035;
            } else {
                desconto = 0.053;
            }
        } else if (tipo == 'G'){
            precoLitro = 2.50;
            if (litros <= 35){
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo inválido!");
            return;
        }

        double valorBruto = litros*precoLitro;
        double valorDesconto = valorBruto*desconto;
        double valorPagar = valorBruto - valorDesconto;

        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);
        }
    }
}