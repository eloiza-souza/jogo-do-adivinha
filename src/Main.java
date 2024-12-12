import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        guessGame(scanner);
        scanner.close();
    }

    //Guess Game
    private static void guessGame(Scanner scanner) {
        boolean running = true;
        int choice = 0;

        System.out.println("\n* * * * * J O G O   D O   A D I V I N H A * * * * *\n");
        System.out.println("Bem vindo ao Jogo!\n\nA qualquer momento que deseje encerrar o jogo e sair digite '0' (zero)");

        do {
            showDifficultyMenu();
            choice = readInteger(scanner);
            if (choice == 0)
                return;
        } while (choice < 0 || choice > 3);

    }

    //Display menu with the difficulty options
    private static void showDifficultyMenu() {
        System.out.println("Escolha o nível de dificuldade desejado: ");
        System.out.println("""
                1 - Fácil
                2 - Médio
                3 - Difícil""");
        System.out.print("Opção: ");
    }

    //Read from keyboard a integer number
    private static int readInteger(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Número inválido. Tente novamente");
            return -1;
        }
    }
}
