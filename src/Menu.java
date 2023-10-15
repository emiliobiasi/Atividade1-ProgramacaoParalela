public class Menu {
    public static Integer MainMenu() throws Exception {
        System.out.println("MENU");
        Integer numProcessadores = Programa.numProcessadores();
        System.out.println("Sua máquina possui " + numProcessadores + " processadores.");
        System.out.println("Tamanho do vetor: ");

        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Opção 1 selecionada.");
                break;
            case 2:
                System.out.println("Opção 2 selecionada.");
                break;
            case 3:
                System.out.println("Opção 3 selecionada.");
                break;
            default:
                System.out.println("Opção não reconhecida.");
        }

        return tamVetor;
    }
}
