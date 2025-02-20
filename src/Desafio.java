
public class Desafio {

    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, digite o número da Conta !");
        int numbCount = Integer.valueOf(args[0]);
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = args[1];
        System.out.println("Por favor, digite seu Nome !");
        String clientName = args[2];
        System.out.println("Por favor, digite o saldo inicial da conta !");
        Double saldo = Double.valueOf(args[3]);

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numbCount + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
