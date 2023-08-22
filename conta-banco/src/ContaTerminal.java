import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = sc.nextLine();
        System.out.println("Por favor, digite o seu Nome!");
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o Saldo !");
        double saldo = sc.nextDouble();

        System.out.println("Olá " +nome+ " obrigado por criar uma conta em nosso banco, sua agênncia é " +numeroAgencia+" conta "+numeroConta+ " e seu saldo " +saldo+ " já está disponível para saque");

        
    
    
    
        sc.close();
    }
}
