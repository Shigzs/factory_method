import java.util.ArrayList;
import java.util.List;

import Factory.Factory;
import Films.*;
import Films.Filme.Genero;

public class Catalogo {
    private List<Filme> filmes;
    private Factory factory;

    public Catalogo(){
        this.factory = new Factory();
        this.filmes = new ArrayList<>();
    }

    public List<Filme> getFilmes() {
        return this.filmes;
    }

    public void addFilmeAcao(String nome){
        filmes.add(factory.novoFilmeAcao(nome));
    }
    public void addFilmeRomance(String nome){
        filmes.add(factory.novoFilmeRomance(nome));
    }
    public void addFilmeFiccao(String nome){
        filmes.add(factory.novoFilmeFiccao(nome));
    }

    public void novoFilme(String nome, Genero genero){
        filmes.add(factory.novoFilme(nome,genero));
    }
}
