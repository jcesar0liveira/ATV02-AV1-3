public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("12345-6", "Alice");
        ContaBancaria conta2 = new ContaBancaria("65432-1", "Bob");


        conta1.exibirSaldo();
        conta2.exibirSaldo();


        conta1.depositar(500);
        conta2.depositar(300);


        conta1.exibirSaldo();
        conta2.exibirSaldo();


        conta1.sacar(200);
        conta2.sacar(100);


        conta1.exibirSaldo();
        conta2.exibirSaldo();


        conta1.transferir(conta2, 150);


        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
