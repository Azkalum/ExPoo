package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Livro extends Produto {

    public String autor;
    public String tema;
    public int qtdPag;

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public Livro() {
        super();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    public ArrayList<Livro> Livros = new ArrayList<>();
    Livro l1 = new Livro();
    Livro l2 = new Livro();
    Livro l3 = new Livro();




}




