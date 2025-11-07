import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.println("Responda as perguntas com SIM ou NAO:");

        System.out.print("1. Telefonou para a vítima? ");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim"))
            contador++;

        System.out.print("2. Esteve no local do crime? ");
        resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim"))
            contador++;

        System.out.print("3. Mora perto da vítima? ");
        resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim"))
            contador++;

        System.out.print("4. Devia para a vítima? ");
        resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim"))
            contador++;

        System.out.print("5. Já trabalhou com a vítima? ");
        resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim"))
            contador++;

        System.out.print("6. Foi vista nas proximidades no dia do crime? ");
        resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim"))
            contador++;

        System.out.print("7. Possui algum objeto da vítima? ");
        resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim"))
            contador++;

        System.out.print("8. Tentou fugir após o crime? ");
        resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim"))
            contador++;

        System.out.println("\nClassificação:");
        if (contador == 2) {
            System.out.println("Suspeita");
        } else if (contador >= 3 && contador <= 4) {
            System.out.println("Cúmplice");
        } else if (contador >= 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        sc.close();
    }
}
