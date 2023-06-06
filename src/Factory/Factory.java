package Factory;

import Films.*;
import Films.Filme.Genero;

public class Factory {

    public Filme novoFilmeAcao(String nome){
        FilmeAcao filme = new FilmeAcao(nome);
        filme.setGenero(Genero.ACAO);
        return filme;
    }

    public Filme novoFilmeFiccao(String nome){
        FilmeFiccaoCientifica filme = new FilmeFiccaoCientifica(nome);
        filme.setGenero(Genero.FICCAO);
        return filme;
    }

    public Filme novoFilmeRomance(String nome){
        FilmeRomance filme = new FilmeRomance(nome);
        filme.setGenero(Genero.ROMANCE);
        return filme;
    }

    //-----------------------------------------------------------------------
    
    public Filme novoFilme(String nome, Genero genero){
        switch(genero){
            case ACAO:
                FilmeAcao filme = new FilmeAcao(nome);
                filme.setGenero(Genero.ACAO);
                return filme;
            case FICCAO:
                FilmeFiccaoCientifica filme2 = new FilmeFiccaoCientifica(nome);
                filme2.setGenero(Genero.FICCAO);
                return filme2;
            case ROMANCE:
                FilmeRomance filme3 = new FilmeRomance(nome);
                filme3.setGenero(Genero.ROMANCE);
                return filme3;
            default:
                return null;
        }
    }
}