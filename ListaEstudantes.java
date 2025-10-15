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
        lista.forEach((e) -> {
            if (e.getId() == indice) {

            }
        });
    }

    public List<Estudante> buscarEstudantesPorNome(String substring) {
        List<Estudante> estudantesComMesmoNome = new ArrayList<>();
        lista.forEach((e) -> {
            if (e.getNome().equals(substring)) {
                estudantesComMesmoNome.add(e);
            }
        });
        return estudantesComMesmoNome;
    }

    void ordenarEstudantesPorNome() {
        lista.sort((e1, e2) -> e1.getNome().compareTo(e2.getNome()));
        System.out.println("Lista de Estudantes Ordenada");
        lista.forEach((e) -> {
            System.out.println("------------------");
            System.out.println(e.getNome());
        });

    }

    void mostrarListaEstudantes() {
        System.out.println("Lista de Estudantes");
        System.out.println("ID / Nome");
        lista.forEach((e) -> {
            System.out.println("------------------");
            System.out.println(e.getId() + "- " + e.getNome());
        });
    }
}
