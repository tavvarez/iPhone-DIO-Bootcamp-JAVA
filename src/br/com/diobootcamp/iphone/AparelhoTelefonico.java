package br.com.diobootcamp.iphone;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.diobootcamp.iphone.Model.Contato;

public class AparelhoTelefonico {

    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(String nome, String numero) {
        Model.Contato contato = new Model().new Contato(nome, numero);
        contatos.add(contato);
    }

    public List<Contato> listarContatosFavoritos() {
        return contatos.stream()
                .filter(contato -> contato.getNome().startsWith("Favorito: "))
                .collect(Collectors.toList());
    }
}
