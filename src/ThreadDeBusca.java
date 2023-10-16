import java.util.Vector;

public class ThreadDeBusca extends Thread{
    Vector<Character> vetorGigante;
    Integer i;
    Integer f;
    Integer v;



    public ThreadDeBusca (Vector<Character> vetorGigante, Integer i, Integer f, Integer v) throws Exception
    {
        if (vetorGigante==null)
            throw new Exception ("Vetor ausente");

        if (i==null)
            throw new Exception ("Início 'i' ausente");

        if (f==null)
            throw new Exception ("Fim 'f' ausente");

        if (v==null)
            throw new Exception ("Valor a ser buscado 'v' ausente");

        this.vetorGigante = vetorGigante;
        this.i         = i;
        this.f         = f;
        this.v       = v;
    }

    private boolean fim = false;

    public void morra ()
    {
        this.fim=true;
    }

    public void run ()
    {
        char caractere='a';
        while (!this.fim)
        {
            
        }
    }


}
