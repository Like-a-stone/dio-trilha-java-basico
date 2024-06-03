import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Conta conta = new Conta();

        System.out.println("Por favor, digite o número da Agência !");
        conta.setAgencia(scanner.nextInt());
        System.out.println("Por favor, digite o número da Conta !");
        conta.setConta(scanner.nextInt());
        System.out.println("Por favor, digite seu saldo !");
        conta.setSaldo(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Por favor, digite seu nome !");
        conta.setNomeCliente(scanner.nextLine());
        cliente.setNomeCliente(conta.getNomeCliente());
        

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo  já está disponível para saque",
         conta.getNomeCliente(), conta.getAgencia(), conta.getConta(), conta.getSaldo());

        scanner.close();
    }
}
