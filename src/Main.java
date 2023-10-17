import java.util.Collections;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        try
        {
            int tamVetor = 1000000;

            Vector<Integer> vetorGigante = new Vector<>(tamVetor);
            for (int i = 0; i < tamVetor; i++) {
                vetorGigante.add(i);
            }
            Collections.shuffle(vetorGigante);

            Integer NumeroDeThreads = Programa.numProcessadores();
            Integer valorBuscado = 2000000;

            int tamanhoPorThread = vetorGigante.size() / NumeroDeThreads;
            ThreadDeBusca[] threads = new ThreadDeBusca[NumeroDeThreads];

            System.out.println(NumeroDeThreads);
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
                if (posicaoEncontrada != null) {
                    Integer threadQueEncontrou = threadDeBusca.getThreadId();
                    System.out.println("Posição encontrada pela thread: " + posicaoEncontrada);
                    System.out.println("Thread que encontrou: " + threadQueEncontrou);
                }
            }


        }
        catch (Exception erro)
        {} // sei que não passei null para o construtor de nenhuma das tarefas

    }
}
