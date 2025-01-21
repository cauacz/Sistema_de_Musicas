package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    // Uso do Polimorfismo
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto");
        } else{
            System.out.println(audio.getTitulo() + " também é um dos mais queridos atualmente");
        }

    }
}
