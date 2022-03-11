package Execício_1;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo= new Veiculo();
        veiculo.setMarca("Honda");
        veiculo.setModelo("Civic EXL Sport");
        veiculo.setPlaca("POO2022");
        veiculo.setCor("Branco");
        veiculo.setKm(13000);
        veiculo.setLigado(false);
        veiculo.setVelocidade(0);
        veiculo.setPreço(90000);

        System.out.println("Marca: " +veiculo.getMarca());
        System.out.println("Modelo: " +veiculo.getModelo());
        System.out.println("Placa" +veiculo.getPlaca());
        System.out.println("Cor: " +veiculo.getCor());
        System.out.println("Km: " +veiculo.getKm());
        System.out.println("Estado atual: " +veiculo.isLigado());
        System.out.println("Velocidade atual: " +veiculo.getVelocidade());
        System.out.println("Preço do carro: " +veiculo.getPreço() + "R$");

        veiculo.acelerar();
        veiculo.abastecer(40);
        veiculo.abastecer(30);
        veiculo.frear();
        veiculo.frear();
        veiculo.pintar("Preto");
        System.out.println("Cor: " +veiculo.getCor());
        veiculo.ligar();
        veiculo.ligar();
        veiculo.desligar();
        veiculo.desligar();



    }
}