import java.util.Collections;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        try
        {
            int[] respostas = Menu.mainMenu();
            int tamVetor = respostas[0];
            System.out.println("Tamanho do Vetor: " + tamVetor);

            Vector<Integer> vetorGigante = new Vector<>(tamVetor);
            for (int i = 0; i < tamVetor; i++) {
                vetorGigante.add(i);
            }
            Collections.shuffle(vetorGigante);

            int NumeroDeThreads = Programa.numProcessadores();
            Integer valorBuscado = respostas[1];
            System.out.println("Valor Buscado: " + valorBuscado);

            int tamanhoPorThread = vetorGigante.size() / NumeroDeThreads;
            ThreadDeBusca[] threads = new ThreadDeBusca[NumeroDeThreads];

            for (int i = 0; i < NumeroDeThreads; i++) {
                int inicio = i * tamanhoPorThread;
                int fim = (i == NumeroDeThreads - 1) ? vetorGigante.size() : (i + 1) * tamanhoPorThread;

                threads[i] = new ThreadDeBusca(vetorGigante, inicio, fim, valorBuscado, i+1);
                threads[i].start();
            }

            for (ThreadDeBusca thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (ThreadDeBusca threadDeBusca : threads) {
                Integer posicaoEncontrada = threadDeBusca.getPosicaoEncontrada();
                Integer threadQueEncontrou = threadDeBusca.getThreadId();
                if (posicaoEncontrada == null) {
                    System.out.println("valor NÃO ENCONTRADO pela thread: " + threadQueEncontrou);

                } else {
                    System.out.println("Valor ENCONTRADO na posição " + posicaoEncontrada + " pela thread: " + threadQueEncontrou);
                }
            }
        }
        catch (Exception erro)
        {}

    }
}
