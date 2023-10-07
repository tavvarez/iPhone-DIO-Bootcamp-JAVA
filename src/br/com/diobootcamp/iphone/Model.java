package br.com.diobootcamp.iphone;


public class Model {
    class Musica {
        private String nome;
        private String artista;

        public Musica(String nome, String artista) {
            this.nome = nome;
            this.artista = artista;
        }

        public String getNome() {
            return nome;
        }

        public String getArtista() {
            return artista;
        }
    }

    class Contato {
        private String nome;
        private String numero;

        public Contato(String nome, String numero) {
            this.nome = nome;
            this.numero = numero;
        }

        public String getNome() {
            return nome;
        }

        public String getNumero() {
            return numero;
        }
    }
}
