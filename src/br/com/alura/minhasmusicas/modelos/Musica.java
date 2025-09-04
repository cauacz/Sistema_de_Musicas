package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    private static final int CLASSIFICACAO_MAXIMA = 10;
    private static final int CLASSIFICACAO_MINIMA = 7;
    private static final int REPRODUCOES_PARA_CLASSIFICACAO_MAXIMA = 200;

    // Lógica de classificação de músicas
    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > REPRODUCOES_PARA_CLASSIFICACAO_MAXIMA){
            return CLASSIFICACAO_MAXIMA;
        } else{
            return CLASSIFICACAO_MINIMA;
        }
    }

}
