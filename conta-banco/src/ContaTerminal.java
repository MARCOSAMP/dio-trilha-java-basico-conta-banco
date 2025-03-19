import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir mensagens para usuários
        //Obter pela classe Scanner os valores digitados no terminal
        // Exibir mensagem conta criada

        Scanner scanner = new Scanner(System.in);

        double saldo = 25;
        double valorSolicitado;

        System.out.println("Informe o valor a ser sacado");
        valorSolicitado = scanner.nextDouble();
    

        if (saldo >= valorSolicitado) {
            System.out.println("Saque efetuado com sucesso!");
            saldo = saldo - valorSolicitado;
        }else{
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo atual: "+saldo);
    }
}
