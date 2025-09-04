package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private static final int CLASSIFICACAO_MAXIMA = 10;
    private static final int CLASSIFICACAO_MINIMA = 8;
    private static final int CURTIDAS_PARA_CLASSIFICACAO_MAXIMA = 500;

    // Lógica de classificação de podcasts
    @Override
    public int getClassificacao(){
        if (this.getTotalCurtidas() > CURTIDAS_PARA_CLASSIFICACAO_MAXIMA){
            return CLASSIFICACAO_MAXIMA;
        } else{
            return CLASSIFICACAO_MINIMA;
        }
    }

}
