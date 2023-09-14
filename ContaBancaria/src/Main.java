import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Renan";
        String tipoConta = "Corrente";
        double saldo = 1599.89;
        int opcao = 0;

        System.out.println("********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta " + tipoConta);
        System.out.println("Saldo atual: " +saldo);
        System.out.println("\n********************");

        String menu = """
                **Digite sua opção**
                1 - Consultar Saldo.
                2 - Transferência.
                3 - Receber valor.
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Saldo atual: " + saldo);
            }
            else if (opcao == 2){
                System.out.println("Digite o valor de transferência");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insuficiente.");
                }
                else {
                    saldo -= valor;
                    System.out.println("Saldo disponível: " + saldo);
                }
            }
            else if (opcao == 3){
                System.out.println("Valor recebido ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo disponível: " + saldo);
            }
            else if (opcao != 4){
                System.out.println("Opção inválida");
            }
        }

    }
}