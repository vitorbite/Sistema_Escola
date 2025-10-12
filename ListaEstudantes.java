import java.util.ArrayList;
import java.util.List;

public class ListaEstudantes {
    Estudante temp = null;
    List<Estudante> lista = new ArrayList<>();

    void adicionarEstudante(Estudante e) {
        lista.add(e);
    }

    void removerEstudantePorId(int id) {
        lista.removeIf((aluno) -> aluno.getId() == id);
    }

    void obterEstudantePorIndice(int indice) {
        lista.get(indice);
    }

    public Estudante buscarEstudantesPorNome(String substring) {
        lista.forEach((e) -> {
            if (e.getNome().equals(substring)) {
                temp = e;
            }
        });
        return temp;
    }

    void ordenarEstudantesPorNome() {
        

    }
}
