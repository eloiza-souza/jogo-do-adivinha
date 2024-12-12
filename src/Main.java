import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        guessGame(scanner);
        scanner.close();
    }

    //Guess Game
    private static void guessGame(Scanner scanner) {
        int choice = 0;
        int accumulatedScore = 0;
       List<Integer> correctNumbers = new ArrayList<>();
       List<Integer> wrongNumbers = new ArrayList<>();

        System.out.println("\n* * * * * J O G O   D O   A D I V I N H A * * * * *\n");
        System.out.println("""
                Bem vindo ao Jogo!
                
                A qualquer momento que deseje encerrar o jogo e sair digite '0' (zero)
                """);
        showDifficultyMenu();
        do {
            choice = readInteger(scanner);
            if (choice == 0) {
                exitMessage();
                return;
            }
            if(choice < 1 || choice > 3)
                showInvalidNumberMessage();
        } while (choice < 0 || choice > 3);

        int max = maxNumber(choice);

        while (true) {

            int userNumber = readUserNumber(scanner, max);
            if (userNumber == 0) {
                showResult(accumulatedScore, correctNumbers,wrongNumbers);
                exitMessage();
                return;
            }
            int systemNumber = drawnNumber(max);
            int scored = compareNumbers(systemNumber, userNumber);
            accumulatedScore += scored;

            if (scored == 10)
                correctNumbers.add(userNumber);
            else
                wrongNumbers.add(userNumber);

            showScore(scored, systemNumber, accumulatedScore);

        }
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
            showInvalidNumberMessage();
            scanner.nextLine();
            return readInteger(scanner);
        }
    }

    // Draws a random number between 1 and parameter value "max"
    private static int drawnNumber(int max) {
        return (int) (Math.random() * max) + 1;
    }

    //Return the max value
    private static int maxNumber(int choice) {
        return switch (choice) {
            case 1 -> 10;
            case 2 -> 50;
            case 3 -> 100;
            default -> 0;
        };
    }

    //read from keyboard the user option integer number until the max number inclusive
    private static int readUserNumber(Scanner scanner, int max) {
        int number = 0;
        do {
            System.out.print("Digite um número inteiro entre 1 e " + max + " ou '0' para sair: ");
            number = readInteger(scanner);

        } while (number < 0 || number > max);

        return number;
    }

    //compare numbers from system and user and return the scored
    private static int compareNumbers(int systemNumber, int userNumber) {
        return (userNumber == systemNumber) ? 10 : (userNumber + 1 == systemNumber || userNumber - 1 == systemNumber) ? 5 : 0;
    }

    private static void exitMessage() {
        System.out.println("\nObrigado por jogar! Até a próxima!");
    }

    //show the score in this round
    private static void showScore(int scored, int systemNumber, int accumulatedScore) {
         switch (scored) {
            case 10 -> System.out.println("Parabéns! Você acertou o número e ganhou 10 pontos!");
            case 5 -> System.out.println("Quase lá! Você estava a 1 de distância do número sorteado. Fez 5 pontos.");
            case 0 -> System.out.println("Que pena! O número sorteado era " + systemNumber + ".");
            default -> System.out.println("*** Não identificamos sua pontuação! ***");
        };
        System.out.println("Pontuação total: " + accumulatedScore);
    }


    private static void showResult(int accumulatedScore, List<Integer> correctNumbers, List<Integer> wrongNumbers) {
        System.out.println("\nVocê alcançou " + accumulatedScore + " pontos!\nNúmeros acertados: "
                + correctNumbers.toString() + "\nNúmeros errados: " + wrongNumbers.toString());

    }

    private static void showInvalidNumberMessage (){
        System.out.print("Entrada inválida. Digite novamente: ");
    }

}
