package dadosexp;

import java.util.Scanner;

import br.com.serratec.conclusao.ContaCorrente;
//import br.com.serratec.conclusao.ContaPoupanca;

public class SistemaInterno {

    public static void main(String[] args) {

        ContaCorrente CC = new ContaCorrente();

        int op1 = 5;
        String ts = CC.toString();
        System.out.println(ts);
        // Cliente VAIDESGRACA = new Cliente("Conta corrente", "Lauro", "66666666666",
        // "2345678");
        ContaCorrente cc = new ContaCorrente();
        //ContaPoupanca cp = new ContaPoupanca(0.2);
        Scanner leia = new Scanner(System.in);

        ///////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\nFaça o login de uma conta cadastrada no serviço:\n" + "\nNome: ");
        String nomey = leia.nextLine();

        System.out.println("Senha: ");
        int senhaX = leia.nextInt();

        System.out.println("\n_______-_____*_____!_____*_____-_______\n" + "\nDigite o seu tipo de conta:"
                + "\n [1] - Para conta corrente" + "\n [2] - Para conta Poupança"
                + "\n [3] - Para verificação de plano de saúde" + "\n [4] - Para ver o seu perfil"
                + "\n [5] - Fechar programa");

        op1 = leia.nextInt();

        if (op1 < 5) {
            switch (op1) {
            case 1:
                System.out.println("\n\nDigite a operação que deseja executar:" + "\n [1] - Saque" + "\n [2] - Deposito"
                        + "\n [3] - Saldo" + "\n [4] - Close");

                int op2 = leia.nextInt();

                do {

                    switch (op2) {

                    case 1:
                        System.out.println("Digite o valor que desejas sacar: ");
                        double saque = leia.nextDouble();

                        if (saque > cc.saldo) {
                            System.out.println("Saldo insuficiente!");
                            break;
                        } else {
                            System.out.println("Saque de" + saque + " aprovado!");
                            cc.getValorSaque(saque);
                            break;
                        }

                    case 2:
                        System.out.println("Digite o valor para o deposito: ");
                        double deposito = leia.nextDouble();

                        System.out.println("Saldo atual de:" + cc.getValorDeposito(deposito + cc.saldo));
                    
                        break;
                        

                    case 3:
                        System.out.println(cc.ImprimirSaldo());

                        break;

                    case 4:
                        System.out.println("Fechando programa!");
                    }

                } while (op2 != 4);

            case 2:
                System.out.println("O rendimento da sua conta poupança é de:");

            case 3:
                System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");

            case 4:
                System.out.println("Nome: " + nomey + "\nCPF: " + "\nSenha: " + senhaX);

            }

        } else if (op1 == 5) {
            System.out.println("Sistema fechado");
        } else {
            System.out.println("Erro");
        }
        leia.close();
    }
}