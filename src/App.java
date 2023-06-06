import java.text.NumberFormat;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

import Films.Filme;

public class App {
    public static void main(String[] args) throws Exception {
        Catalogo catalogo = new Catalogo();

        catalogo.addFilmeAcao("Velozes e Furioso 10");
        catalogo.addFilmeFiccao("Star Wars - Capítulo 9");
        catalogo.addFilmeRomance("Como eu era antes de você");

        System.out.println("Filmes em catálogo: " + catalogo.getFilmes());

        //-----------------------------------------------------------------------------

        Catalogo catalogo2 = new Catalogo();

        catalogo2.novoFilme("Velozes e Furioso 10", Filme.Genero.ACAO);
        catalogo2.novoFilme("Star Wars - Capítulo 9", Filme.Genero.FICCAO);
        catalogo2.novoFilme("Como eu era antes de você", Filme.Genero.ROMANCE);

        System.out.println("Filmes em catálogo: " + catalogo2.getFilmes());

        //-----------------------------------------------------------------------------

        //Static Factory Methods

        Calendar.getInstance();
        NumberFormat.getInstance();
        List.of(1, 2, 3, 4);
        Stream.of(1, 2, 3, 4);

    }
}
