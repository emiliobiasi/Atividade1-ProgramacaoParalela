import java.util.List;

public class Main {
    public static void main(String[] args) {
        try
        {

            Menu.MainMenu();

            int tamanhoDoVetor = 10;
            Vetor vetor = new Vetor(tamanhoDoVetor);

            List<Integer> vetorEmbaralhado = vetor.getVetorEmbaralhado();
            for (int numero : vetorEmbaralhado) {
                System.out.print(numero + " ");
            }

        }
        catch (Exception erro)
        {} // sei que não passei null para o construtor de nenhuma das tarefas

    }
}
