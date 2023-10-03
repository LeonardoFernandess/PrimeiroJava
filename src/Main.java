import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Leonardo";
        String tipoConta = "Corrente";
        double saldo = 2000.00;
        double saque, deposito, transf;
        int opcoes = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("**************************************");
        System.out.println("BEM-VINDO AO BANCO ALURA, " + nomeCliente);
        System.out.println(tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("O que deseja fazer?");
        String menu = """
                1- Sacar
                2- Depositar
                3- Trânsferir
                4- Sair
                """;

        while (opcoes != 4) {
            System.out.println(menu);
            System.out.printf("Digite sua opção: ");
            opcoes = ler.nextInt();
            if (opcoes == 1) {
                System.out.println("Você escolheu sacar!");
                System.out.printf("Informe o valor a ser sacado: ");
                saque = ler.nextDouble();
                if (saque > saldo) {
                    System.out.println("Saldo insulficiente para esse operação!" +
                            "\nInsira o valor correto: ");
                    saque = ler.nextDouble();
                    System.out.printf("\nSaque realizado com sucesso seu saldo atual é: " + (saldo - saque));
                    break;
                } else {
                    System.out.printf("\nSaque realizado com sucesso seu saldo atual é: " + (saldo - saque));
                    break;
                }

            }
            if (opcoes == 2) {
                System.out.println("Você escolheu depositar!");
                System.out.printf("Informe o valor do deposito: ");
                deposito = ler.nextDouble();
                if (deposito < 0) {
                    System.out.println("Este valor não é válido" +
                            "\nTente novamente: ");
                    deposito = ler.nextDouble();
                    System.out.printf("\nDeposito realizado com sucesso seu saldo atual é: " + (saldo + deposito));
                    break;
                } else {
                    System.out.printf("\nDeposito realizado com sucesso seu saldo atual é: " + (saldo + deposito));
                    break;
                }

            }

            if (opcoes == 3) {
                System.out.println("Você escolheu tranferir!");
                System.out.printf("Informe o valor da transferência: ");
                transf = ler.nextDouble();
                if (transf > saldo) {
                    System.out.println("Saldo insulficiente para esse operação!" +
                            "\nInsira o valor correto: ");
                    transf = ler.nextDouble();
                    System.out.printf("\nTransferencia realizada com sucesso seu saldo atual é: " + (saldo - transf));
                    break;
                } else {
                    System.out.printf("\nDeposito realizado com sucesso seu saldo atual é: " + (saldo - transf));
                    break;
                }
            }

            if (opcoes == 4) {
                System.out.println("O banco alura agradece, até a próxima.");
                break;
            }
        }
    }
}