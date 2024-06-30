import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Por favor, informe o número da conta");
        int numero= sc.nextInt();
        System.out.println("Por favor, informe o número da agencia");
        String agencia= sc.nextLine();
        agencia= sc.nextLine();
        System.out.println("Por favor, informe o nome do titular da conta");
        String nomeCliente= sc.nextLine();
        sc.nextLine();
        System.out.println("Por favor, informe o saldo da conta");
        double saldo= sc.nextDouble();
        System.out.println("Olá,"+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+ ", conta "+ numero +" e seu saldo "+saldo +" já está disponível para saque");
    
    }
}
