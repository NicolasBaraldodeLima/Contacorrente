
public class Contacorrente {

    private String titular; //  variáveis  com private são acessadas apenas por esta clase
    private double saldo;



    //construtor
    public Contacorrente(String titular,  double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;

        // Aqui, this.titular refere-se ao atributo titular da instância atual da classe
        // ContaCorrente.
        // A palavra-chave this é usada para distinguir o atributo da instância da variável
        // local que tem o mesmo nome. Estamos atribuindo o valor do parâmetro titular ao
        // atributo titular da instância.

    }

       // método para depositar dnheiro na conta
        public void depositar(double valor) {
        saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo. R$ " + saldo)   ;
        }


        // Método para sacar dinheiro da conta
        public void sacar(double valor) {

         if (valor > saldo) {
             System.out.println("Saldo insuficiente. Saque não realizado.");
         } else {
             saldo -= valor;
             System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
         }


        }

    // Método para obter informações da conta

    public void imprimirInformacoes() {
        System.out.println("Titulas: " + titular);
        System.out.println("Saldo atual: R$ " + saldo);
    }

 }
