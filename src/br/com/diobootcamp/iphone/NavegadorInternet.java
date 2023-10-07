package br.com.diobootcamp.iphone;


import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    private List<String> abasAbertas = new ArrayList<>();

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba(String url) {
        abasAbertas.add(url);
        System.out.println("Nova aba adicionada: " + url);
    }

    public void atualizarPagina(String url) {
        System.out.println("Atualizando página: " + url);
    }

    public List<String> getAbasAbertas() {
        return abasAbertas;
    }
}
