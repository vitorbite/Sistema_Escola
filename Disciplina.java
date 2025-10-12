public class Disciplina {
    private String código;
    private String nome;
    public Disciplina(String c, String nome) {
        código = c;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}