import java.util.Objects;
import java.util.Vector;

public class ThreadDeBusca extends Thread{
    private Vector<Integer> vetorGigante;
    private Integer i;
    private Integer f;
    private Integer v;
    private Integer threadId;

    private Integer posicaoEncontrada;



    public ThreadDeBusca (Vector<Integer> vetorGigante, Integer i, Integer f, Integer v, Integer threadId) throws Exception {
        if (vetorGigante==null)
            throw new Exception ("Vetor ausente");

        if (i==null)
            throw new Exception ("Início 'i' ausente");

        if (f==null)
            throw new Exception ("Fim 'f' ausente");

        if (v==null)
            throw new Exception ("Valor a ser buscado 'v' ausente");

        if (threadId==null)
            throw new Exception ("Valor do id ausente");

        this.vetorGigante = vetorGigante;
        this.i = i;
        this.f = f;
        this.v = v;
        this.threadId = threadId;
    }

    public Integer getPosicaoEncontrada() {
        return posicaoEncontrada;
    }

    public Integer getThreadId() {
        return this.threadId;
    }

    public void run() {
        for (int j = i; j < f; j++) {
            if (Objects.equals(vetorGigante.get(j), v)) {
                System.out.println("Thread " + threadId + " encontrou o valor " + v + " na posição " + j);
                posicaoEncontrada = j;
                return;
            }
        }
    }
}
