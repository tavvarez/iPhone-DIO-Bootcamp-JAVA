package br.com.diobootcamp.iphone;



public class App {

    public static void main(String[] args) {
        Iphone meuiPhone = new Iphone();
        System.out.println("Bem-vindo ao iPhone!");

        // Adicionar músicas favoritas
        ReprodutorMusical reprodutor = meuiPhone.getReprodutorMusical();
        reprodutor.adicionarMusicaFavorita(new Musica("Música 1", "Artista 1"));
        reprodutor.adicionarMusicaFavorita(new Musica("Música 2", "Artista 2"));

        // Adicionar contatos
        AparelhoTelefonico telefone = meuiPhone.getAparelhoTelefonico();
        telefone.adicionarContato("Favorito: João", "123456789");
        telefone.adicionarContato("Maria", "987654321");
        telefone.adicionarContato("Favorito: Pedro", "555555555");

        // Listar contatos favoritos
        System.out.println("Contatos Favoritos:");
        telefone.listarContatosFavoritos().forEach(contato -> {
            System.out.println(contato.getNome() + ": " + contato.getNumero());
        });
    }
}
