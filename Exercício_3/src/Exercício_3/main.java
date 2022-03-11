package Exercício_3;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<String> magias = new ArrayList<>();
        Mago mago = new Mago("Jaine Proudmore", 200, 350, 50, 50, 25, 1, magias);

        List<String> habilidades = new ArrayList<>();
        Guerreiro guerreiro = new Guerreiro("Ragnar Lothbrook", 500, 190, 50, 40, 65, 1, habilidades);


    }
}