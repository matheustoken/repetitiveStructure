import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de atletas: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline

        String[] nome = new String[n];
        char[] sexo = new char[n];
        double[] altura = new double[n];
        double[] peso = new double[n];

        double maior_Altura = 0, soma_Altura_Mulher = 0;
        String nome_Maior_Altura = "";
        double peso_Medio = 0, peso_Medio_Atletas = 0;
        double porcentagem_Homens = 0, media_Mulher = 0;
        int soma_Homem = 0, soma_Mulher = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do atleta numéro " + (1 + i) + " : ");
            System.out.print("Escreva Nome: ");
            nome[i] = sc.nextLine();

            System.out.print("Qual é o sexo (M/F): ");
            sexo[i] = sc.next().charAt(0);
            sc.nextLine();  // Consume the newline

            while (sexo[i] != 'F' && sexo[i] != 'M') {
                System.out.println("Sexo inválido. Digite novamente (M/F): ");
                sexo[i] = sc.next().charAt(0);
                sc.nextLine();  // Consume the newline
            }

            if (sexo[i] == 'M') {
                soma_Homem++;
            } else if (sexo[i] == 'F') {
                soma_Mulher++;
            }

            System.out.print("Qual é a altura: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Altura inválida. Digite novamente: ");
                sc.next(); // Consume the invalid input
            }
            altura[i] = sc.nextDouble();

            while (altura[i] <= 0) {
                System.out.println("Altura inválida. Digite novamente: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Altura inválida. Digite novamente: ");
                    sc.next(); // Consume the invalid input
                }
                altura[i] = sc.nextDouble();
            }

            if (altura[i] > maior_Altura) {
                maior_Altura = altura[i];
                nome_Maior_Altura = nome[i];
            }

            System.out.print("Qual é o peso: ");

            peso[i] = sc.nextDouble();

            while (peso[i] <= 0) {
                System.out.println("Peso inválido. Digite novamente: ");
                peso[i] = sc.nextDouble();
            }
            sc.nextLine(); // Consume the newline
        }

        for (int i = 0; i < n; i++) {
            if (sexo[i] == 'F') {
                soma_Altura_Mulher += altura[i];
            }
            peso_Medio += peso[i];
        }

        if (soma_Mulher > 0) {
            media_Mulher = soma_Altura_Mulher / soma_Mulher;
        } else {
            System.out.println("Impossível calcular altura média das mulheres.");
        }

        peso_Medio_Atletas = peso_Medio / n;
        porcentagem_Homens = ((double) soma_Homem / n) * 100;

        System.out.println("Relatório");
        System.out.printf("Peso médio dos atletas: %.2f\n", peso_Medio_Atletas);
        System.out.println("Atleta de maior altura: " + nome_Maior_Altura + " (" + maior_Altura + "m)");
        if (soma_Mulher > 0) {
            System.out.printf("Altura média das mulheres: %.2f\n", media_Mulher);
        }
        System.out.printf("Porcentagem de homens: %.1f%%\n", porcentagem_Homens);

        sc.close();
    }
}