package Main;

import Model.Livro;
import Model.Loja;
import Model.VideoGame;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Livro l1 = new Livro ("Senhor dos Anéis", 50.0, 20, "J R.R Tolkien","Fantasia",600);
        Livro l2 = new Livro("Java para Leigos",75.0,15,"Barry A Burd","Programação",424);
        Livro l3 = new Livro("O nome do Vento",40,25,"Patrick Rothfuss","Aventura",656);

        VideoGame m1 = new VideoGame("PS4", 1800, 100, "Sony","Slim",false);
        VideoGame m2 = new VideoGame("Ps4", 700, 10, "Sony","Pro",true);
        VideoGame m3 = new VideoGame("XBOX", 1000, 6, "Microsoft","One",false);

        List<Livro> Livros;
        List<VideoGame> VideoGames;

        Loja submarino = new Loja("Submarino","00.776.574/0001-56",l1,l2,l3,m1,m2,m3);



    }
}
