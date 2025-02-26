    public class ContaBancaria {
        private String numeroConta;
        private String titular;
        private double saldo;

        public ContaBancaria(String numeroConta, String titular) {
            this.numeroConta = numeroConta;
            this.titular = titular;
            this.saldo = 0.0;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saque inválido. Verifique o valor ou saldo disponível.");
            }
        }

        public void transferir(ContaBancaria contaDestino, double valor) {
            if (valor > 0 && valor <= saldo) {
                this.sacar(valor); 
                contaDestino.depositar(valor); 
                System.out.println("Transferência de R$ " + valor + " para a conta " + contaDestino.numeroConta + " realizada com sucesso.");
            } else {
                System.out.println("Transferência inválida. Verifique o valor ou saldo disponível.");
            }
        }


        public void exibirSaldo() {
            System.out.println("Saldo da conta " + numeroConta + ": R$ " + saldo);
        }
    }

