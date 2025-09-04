package br.com.alura.minhasmusicas.modelos;

public abstract class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;

    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduzir(){
        this.totalReproducoes++;
    }

    // O título poderá ser modificado diretamente pelo usuário: set
    // Demais atributos de audio serão modificados por meio de métodos específicos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public abstract int getClassificacao();
}
