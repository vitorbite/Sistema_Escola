import java.util.TreeSet;
import java.util.Set;
public class CadastroDisciplinas{
    TreeSet<Disciplina> set = new TreeSet<>();
    void adicionarDisciplina(Disciplina d){
        set.add(d);
        System.out.println(set);
    }
    boolean verificarDisciplina(String codigo){
        return false;
    }
    void removerDisciplina(String codigo){

    }
    Set<Disciplina> obterTodasDisciplinas(){
        return set;
    }
}
