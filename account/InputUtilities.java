package OnePieceGame.account;

import java.util.Scanner;

public class InputUtilities {
    private static Scanner scanner = new Scanner(System.in);
    public static int readIntNumbers(String message) {
        while (true) {
            System.out.println(message);

            String entrada = scanner.nextLine();

            try {
                int numeroConvertido = Integer.parseInt(entrada);
                return numeroConvertido;
            }catch (NumberFormatException e) {
                System.err.println("Apenas numeros inteiros aqui.");
            }
        }
    }

    public static double readNumbers(String mensagem) {
        while (true) {
            System.out.println(mensagem);

            String entradaDouble = scanner.nextLine();

            try {
                double numeroConvertido = Double.parseDouble(entradaDouble);
                return numeroConvertido;
            }catch (NumberFormatException e) {
                System.err.println("Apenas numeros.");
            }
        }
    }

    public static String readCPF(String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String entrada = scanner.nextLine();

            if (entrada.matches("[0-9.-]+")) {
                return entrada;
            }else {
                System.err.println("DIGITOS DO CPF INVALIDOS");
            }
        }
    }
}
