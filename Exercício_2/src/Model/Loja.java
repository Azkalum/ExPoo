package Model;

import java.util.List;

public class Loja extends Produto {

    String nome;
    String cnpj;
    List<Livro>livros;
    List<VideoGame>videoGames;

    public Loja(String nome1, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome1;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public Loja(String submarino, String cnpj, Livro l1, Livro l2, Livro l3, VideoGame m1, VideoGame m2, VideoGame m3) {
    }

    List<Livro> getLivros() {
        return livros;
    }

    List<VideoGame> getVideoGames(){
        return videoGames;
    }


}
