import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
		static int parametroUm = 0;
		static int parametroDois = 0;
		static Scanner terminal = new Scanner(System.in);
    public static void main(String[] args) {
		

		// Chamando metodo para recebe e analisar o tipo dos parametros. 
		try {
			parametroUm = getParametro("Digite o primeiro parâmetro");
			parametroDois = getParametro("Digite o segundo parâmetro");
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}

		terminal.close();

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
		}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if( parametroUm > parametroDois)
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		
		int contagem = parametroDois - parametroUm;

		//realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.printf("Imprimindo o número %d \n", i);
            parametroUm++;
        }
	} 
	static int getParametro(String msg) throws InputMismatchException {
		System.out.println(msg);

		// Verifica se o parametro recebido é de fato uma variavel do tipo inteiro.
		if (!terminal.hasNextInt()) {
			throw new InputMismatchException("Entrada inválida. Por favor, insira um número inteiro.");
		}
		int parametro = terminal.nextInt();
        return parametro;
	} 
}
