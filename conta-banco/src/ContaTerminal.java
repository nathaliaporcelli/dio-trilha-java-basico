import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String [] args){
       Integer numero;
       String agencia;
       String nomeCliente;
       Double saldo;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a agência");
        agencia = sc.nextLine();
        System.out.println("Digite o nome do cliente");
        nomeCliente = sc.nextLine();
        System.out.println("Digite o saldo");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia +  " conta " + numero +  " e seu saldo de " + String.format("%.2f ",saldo )+ " já está disponível para saque.");





        sc.close();



    }
}
