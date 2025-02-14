import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numero = scan.nextInt();

        System.out.println("Por favor, digite a agência:");
        String agencia = scan.next();

        scan.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scan.nextDouble();

        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque");

        System.out.println(mensagem);

        scan.close();
    }
}
