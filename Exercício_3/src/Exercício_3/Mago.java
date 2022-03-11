package Exercício_3;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem {

  private List<String> magia;

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.magia = magia;
    }

    @Override
    public void lvlUp() {
        setMana(getMana() + 20);
        setInteligencia(getInteligencia() + 20);
        setForca(getForca() + 10);
        setVida(getVida() + 10);

    }

    @Override
    public double attack() {
        return (getInteligencia() * getLevel()) + (Math.random() * 300);

    }

    public String Magia(String magia){
        List<String> magias = new ArrayList<>();
        magias = getMagia();
        magias.add(magia);
        setMagia(magias);
        return getMagia().toString();

    }

    private List<String> getMagia() {
        return magia;
    }

    private void setMagia(List<String> magias) {
    }


}
