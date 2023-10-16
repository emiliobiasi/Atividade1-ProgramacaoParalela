import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Vetor {
    private List<Integer> vetor;

    public Vetor(int tamanhoDoVetor) {
        vetor = new ArrayList<>();
        preencherVetorUnico(tamanhoDoVetor);
        embaralharVetor();
    }

    private void preencherVetorUnico(int tamanhoDoVetor) {
        for (int i = 1; i <= tamanhoDoVetor; i++) {
            vetor.add(i);
        }
    }

    private void embaralharVetor() {
        Collections.shuffle(vetor);
    }

    public List<Integer> getVetorEmbaralhado() {
        return vetor;
    }


}


