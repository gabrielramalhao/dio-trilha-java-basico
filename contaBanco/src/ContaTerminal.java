import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao nosso banco!");

        System.out.println("Por favor, digite o seu nome: ");
        String nome = read.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = read.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        int conta = read.nextInt();
        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = read.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        read.close();
    }
}
