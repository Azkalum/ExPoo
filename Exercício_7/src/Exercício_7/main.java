package Exercício_7;

public class main {

        public static void main(String[] args) {

        Gerente gerente = new Gerente("Paulo", 61,13000);
        Supervisor supervisor = new Supervisor("Amanda",32,6900);
        Vendedor vendedor = new Vendedor("Marcelo",26,3000);

        System.out.println("A bonificação do gerente é: " + gerente.bonificacao());
        System.out.println("A bonificação da supervisora é: " + supervisor.bonificacao());
        System.out.println("A bonificação do vendedor é " + vendedor.bonificacao());

}
}
