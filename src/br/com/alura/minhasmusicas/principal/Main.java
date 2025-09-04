package br.com.alura.minhasmusicas.principal;
import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Clocks");
        minhaMusica.setArtista("Cold Play");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Carreiras na Área de TI em 2025");
        meuPodcast.setHost("Paulo Silveira");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        System.out.println("Total de reproduções de " + minhaMusica.getTitulo() + ": " + minhaMusica.getTotalReproducoes());
        System.out.println("Total de curtidas de " + minhaMusica.getTitulo() + ": " + minhaMusica.getTotalCurtidas());
        System.out.println("Classificação de " + minhaMusica.getTitulo() + ": " + minhaMusica.getClassificacao() + " estrelas");

        System.out.println("\nTotal de reproduções de " + meuPodcast.getTitulo() + ": " + meuPodcast.getTotalReproducoes());
        System.out.println("Total de curtidas de " + meuPodcast.getTitulo() + ": " + meuPodcast.getTotalCurtidas());
        System.out.println("Classificação de " + meuPodcast.getTitulo() + ": " + meuPodcast.getClassificacao() + " estrelas");

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPodcast);

        System.out.println("\n--- Minhas Músicas e Podcasts Favoritos ---");
        minhasPreferidas.getAudiosFavoritos().forEach(audio ->
                System.out.println(audio.getTitulo() + " - Classificação: " + audio.getClassificacao() + " estrelas")
        );
    }
}