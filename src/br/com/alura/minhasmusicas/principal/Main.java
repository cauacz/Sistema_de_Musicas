package br.com.alura.minhasmusicas.principal;
import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        // Sistema de Músicas
        /* Praticando conceitos de OO, como:
        *   - encapsulamento
        *   - herança
        *   - polimorfismo
        *   - abstração
        * */

        //-----------------------------------------------------------------

        // Criando uma música e atribuindo valores
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Clocks");
        minhaMusica.setArtista("Cold Play");
        minhaMusica.setAlbum("Album Aleatório");
        minhaMusica.setGenero("Pop Hits");

        // Somando o número total de reproduções da música
        for (int i = 0; i < 100; i++) {
            minhaMusica.reproduzir(); // 100 reproduções
        }

        // Somando o número total de curtidas da música
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte(); // 50 curtidas
        }

        //----------------------------------------------------------------

        //Criando um podcast e atribuindo valores
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Carreiras na Área de TI em 2025");
        meuPodcast.setHost("Paulo Silveira");
        meuPodcast.setDescricao("Podcast incrível, que irá abordar sobre o mercado de trabalho na Área de TI em 2025");

        // Somando o total de reproduções do podcast
        for (int i = 0; i <= 50; i++){
            meuPodcast.reproduzir(); // 50 reproduções
        }

        // Somando o total de curtidas do podcast
        for (int i = 0; i <= 100; i++){
            meuPodcast.curte(); // 100 curtidas
        }

        //---------------------------------------------------------------

        // Testando método 'incui'
        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(meuPodcast);
        minhasPreferidas.inclui(minhaMusica);

    }
}