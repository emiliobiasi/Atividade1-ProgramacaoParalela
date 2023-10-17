import java.util.Scanner;

public class Menu {
    public static Integer MainMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU");
        Integer numProcessadores = Programa.numProcessadores();
        System.out.println("Sua máquina possui " + numProcessadores + " processadores.");

        int valor = 0;
        while (valor < 1 || valor > 3) {
            System.out.println("Tamanho do vetor: ");
            System.out.println("[1] - AAA");
            System.out.println("[2] - AAA");
            System.out.println("[3] - AAA");
            valor = scanner.nextInt();
        }

        switch (valor) {
            case 1:
                System.out.println("Opção 1 selecionada.");
                break;
            case 2:
                System.out.println("Opção 2 selecionada.");
                break;
            case 3:
                System.out.println("Opção 3 selecionada.");
                break;
        }

        return valor;
    }
}
