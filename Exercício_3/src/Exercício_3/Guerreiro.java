package Exercício_3;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem{

    private List<String> habilidade;

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidade) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.habilidade = habilidade;
    }

    @Override
    public void lvlUp() {
        setMana(getMana() + 10);
        setInteligencia(getInteligencia() + 10);
        setForca(getForca() + 20);
        setVida(getVida() + 20);

    }

    @Override
    public double attack() {
        return (getForca() * getLevel()) + (Math.random() * 300);
    }

    public String aprendendoHabildade (String habilidade){
        List<String> habilidades = new ArrayList<>();
        habilidades = getHabilidade();
        setHabilidade(habilidades);
        return getHabilidade(). toString();
    }


    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }
}
