package Films;

public abstract class Filme {
    protected String nome;
    protected Genero genero;

    public enum Genero {
        ACAO,
        FICCAO,
        ROMANCE
    }

    public Filme(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme [nome=" + nome + ", genero=" + genero + "]";
    }
}
