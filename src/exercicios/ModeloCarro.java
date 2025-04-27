package exercicios;

public class ModeloCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.definirModelo("Wolkswagen");

        System.out.println(carro1.getNomeDoModelo());
    }
}
