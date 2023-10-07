package br.com.diobootcamp.iphone;


import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {

    private List<Musica> musicasFavoritas = new ArrayList<>();

    public void adicionarMusicaFavorita(Musica musica) {
        musicasFavoritas.add(musica);
    }

    public List<Musica> getMusicasFavoritas() {
        return musicasFavoritas;
    }
}
