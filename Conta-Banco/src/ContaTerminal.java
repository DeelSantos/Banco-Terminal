import java.util.Scanner;
import java.util.Locale;




public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens para o nosso usuário
        System.out.println("Bem vindo ao banco Digital Inovation One!");
        System.out.println();
        System.out.println("Por favor digite seu nome: ");
        //Obter pela scanner os valores digitados no terminal
        String nomeCompleto = scanner.next();
        
        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite a sua agência: ");
        String agencia = scanner.next();

        System.out.println("Quanto você deseja colocar de saldo na sua conta? ");
        double saldo = scanner.nextDouble();

        System.out.println("Estamos validando seus dados...");
        Thread.sleep(2000);
        System.out.println();
        

        System.out.println("Bem vindo " + nomeCompleto + " sua conta foi criada com sucesso!");
        System.out.println("Agencia: " + agencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println();
        System.out.println("Caso queira algo a mais favor retornar ao menu inicial!");
        System.out.println();
        System.out.println("Obrigado e tenha uma boa semana!");
        


        //Exibir a mensagem conta criada
    }
}
