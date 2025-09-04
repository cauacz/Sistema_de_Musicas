package br.com.alura.minhasmusicas.modelos;

import java.util.ArrayList;
import java.util.List;

public class MinhasPreferidas {
    private final List<Audio> audiosFavoritos = new ArrayList<>();
    private static final int CLASSIFICACAO_PARA_SUCESSO = 8;

    public void inclui(Audio audio){
        audiosFavoritos.add(audio);
        if(audio.getClassificacao() >= CLASSIFICACAO_PARA_SUCESSO){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e foi adicionado aos seus favoritos!");
        } else{
            System.out.println(audio.getTitulo() + " também é um dos mais queridos atualmente e foi adicionado aos seus favoritos!");
        }
    }

    public List<Audio> getAudiosFavoritos() {
        return audiosFavoritos;
    }
}
