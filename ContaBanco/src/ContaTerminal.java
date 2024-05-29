import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
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
        

        System.out.println("Olá "+conta.getNomeCliente()+
        ", obrigado por criar uma conta em nosso banco, sua agência é "+conta.getAgencia()+
        ", conta "+conta.getConta()+" e seu saldo "+conta.getSaldo()+" já está disponível para saque");

        scanner.close();
    }
}
