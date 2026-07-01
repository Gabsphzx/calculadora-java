import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            
            do {
                
                printMenu();
                
                System.out.print("Escolha uma opção: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> soma(scanner);
                    case 2 -> subtracao(scanner);
                    case 3 -> multiplicacao(scanner);
                    case 4 -> divisao(scanner);
                    case 0 -> System.out.println("Obrigado por utilizar a calculadora!");
                    default -> System.out.println("Opção inválida!");
                }
                
                if (choice != 0) {
                    System.out.println("\nPressione ENTER para continuar...");
                    scanner.nextLine(); // limpa o buffer
                    scanner.nextLine();
                }
                
            } while (choice != 0);
        }
    }

    private static void printMenu() {
        System.out.println("\n==============================");
        System.out.println("   CALCULADORA EM JAVA");
        System.out.println("==============================");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");
        System.out.println("==============================");
    }

    private static double lerNumero(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    private static void mostrarResultado(String operacao, double resultado) {
        System.out.println("Resultado da " + operacao + ": " + resultado);
    }

    private static void soma(Scanner scanner) {

        double num1 = lerNumero(scanner, "Digite o primeiro número: ");
        double num2 = lerNumero(scanner, "Digite o segundo número: ");

        double resultado = num1 + num2;

        mostrarResultado("soma", resultado);
    }

    private static void subtracao(Scanner scanner) {

        double num1 = lerNumero(scanner, "Digite o primeiro número: ");
        double num2 = lerNumero(scanner, "Digite o segundo número: ");

        double resultado = num1 - num2;

        mostrarResultado("subtração", resultado);
    }

    private static void multiplicacao(Scanner scanner) {

        double num1 = lerNumero(scanner, "Digite o primeiro número: ");
        double num2 = lerNumero(scanner, "Digite o segundo número: ");

        double resultado = num1 * num2;

        mostrarResultado("multiplicação", resultado);
    }

    private static void divisao(Scanner scanner) {

        double num1 = lerNumero(scanner, "Digite o primeiro número: ");
        double num2 = lerNumero(scanner, "Digite o segundo número: ");

        if (num2 == 0) {
            System.out.println("Erro: divisão por zero não é permitida.");
            return;
        }

        double resultado = num1 / num2;

        mostrarResultado("divisão", resultado);
    }
}
