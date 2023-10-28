public class Main {
    public static void main(String[] args) {

        // Instanciando uma conta corrente

        Contacorrente conta = new Contacorrente("João", 1000.0);

        // Realizando operações na conta

        conta.depositar(500.0);
        conta.sacar(200.0);

        conta.imprimirInformacoes();
    }
}