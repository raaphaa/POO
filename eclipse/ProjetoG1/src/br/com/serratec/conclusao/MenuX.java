package br.com.serratec.conclusao;

public class MenuX {
    private String tipo;

    public MenuX(String tipo) {
        super();
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String menuInicial() {
        return "Faça o login de uma conta cadastrada no serviço:\n" 
                + "\nNome: " 
                + "\nSenha: ";
    }

    public String menuFuncionalidades() {
        return "\n\n_______-_____*_____!_____*_____-_______\n" 
                + "\nDigite o seu tipo de conta: \n"
                + "\n [1] - Para conta corrente" 
                + "\n [2] - Para conta Poupança"
                + "\n [3] - Para verificação de plano de saúde" 
                + "\n [4] - Para ver o seu perfil"
                + "\n [5] - Fechar programa";
    }

    public String menuContaCorrente() {
        return "\nDigite a operação que deseja executar:\n" 
                + "\n [1] - Saque" 
                + "\n [2] - Deposito" 
                + "\n [3] - Saldo"
                + "\n [4] - Close";
    }

    public String menuContaPoupanca() {
        return "\nDigite a operação que deseja executar:\n" 
                + "\n [1] - Relatório de rendimentos" 
                + "\n [2] - Saldo"
                + "\n [3] - Close";
    }

    public String menuContaGerete() {
        return "\nDigite a operação que deseja executar:\n" 
                + "\n [1] - Saque" 
                + "\n [2] - Deposito"
                + "\n [3] - Transferência" 
                + "\n [4] - Relatório de tribução"
                + "\n [5] - Saldo" 
                + "\n [6] - Close";
    }

    public String menuDiretor() {
        return "\nDigite a operação que deseja executar:\n" 
                + "\n [1] - Saque" 
                + "\n [2] - Deposito"
                + "\n [3] - Transferência" 
                + "\n [4] - Relatório de tribução" 
                + "\n [5] - Saldo" 
                + "\n [6] - Close"
                + "\n [7] - Relatórios de clientes";
    }

    public String menuPresidente() {
        return "\nDigite a operação que deseja executar:\n" 
                + "\n [1] - Saque" 
                + "\n [2] - Deposito"
                + "\n [3] - Transferência" 
                + "\n [4] - Relatório de tribução" 
                + "\n [5] - Saldo" 
                + "\n [6] - Close"
                + "\n [7] - Relatórios de clientes" 
                + "\n [8] - Relatórios gerais";

    }
}