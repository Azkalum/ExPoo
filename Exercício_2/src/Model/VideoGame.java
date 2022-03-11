package Model;

import java.util.ArrayList;

public class VideoGame extends Produto{

    public String marca;
    public String modelo;
    public boolean isUsado;

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public VideoGame() {
        super();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        if(isUsado == true){

            isUsado = true;

        }else{

        }
    }

    public ArrayList<VideoGame> Videogames = new ArrayList<>();
    VideoGame m1 = new VideoGame();
    VideoGame m2 = new VideoGame();
    VideoGame m3 = new VideoGame();



}
