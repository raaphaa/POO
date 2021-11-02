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
        return "Fa�a o login de uma conta cadastrada no servi�o:\n" 
                + "\nNome: " 
                + "\nSenha: ";
    }

    public String menuFuncionalidades() {
        return "\n\n_______-_____*_____!_____*_____-_______\n" 
                + "\nDigite o seu tipo de conta: \n"
                + "\n [1] - Para conta corrente" 
                + "\n [2] - Para conta Poupan�a"
                + "\n [3] - Para verifica��o de plano de sa�de" 
                + "\n [4] - Para ver o seu perfil"
                + "\n [5] - Fechar programa";
    }

    public String menuContaCorrente() {
        return "\nDigite a opera��o que deseja executar:\n" 
                + "\n [1] - Saque" 
                + "\n [2] - Deposito" 
                + "\n [3] - Saldo"
                + "\n [4] - Close";
    }

    public String menuContaPoupanca() {
        return "\nDigite a opera��o que deseja executar:\n" 
                + "\n [1] - Relat�rio de rendimentos" 
                + "\n [2] - Saldo"
                + "\n [3] - Close";
    }

    public String menuContaGerete() {
        return "\nDigite a opera��o que deseja executar:\n" 
                + "\n [1] - Saque" 
                + "\n [2] - Deposito"
                + "\n [3] - Transfer�ncia" 
                + "\n [4] - Relat�rio de tribu��o"
                + "\n [5] - Saldo" 
                + "\n [6] - Close";
    }

    public String menuDiretor() {
        return "\nDigite a opera��o que deseja executar:\n" 
                + "\n [1] - Saque" 
                + "\n [2] - Deposito"
                + "\n [3] - Transfer�ncia" 
                + "\n [4] - Relat�rio de tribu��o" 
                + "\n [5] - Saldo" 
                + "\n [6] - Close"
                + "\n [7] - Relat�rios de clientes";
    }

    public String menuPresidente() {
        return "\nDigite a opera��o que deseja executar:\n" 
                + "\n [1] - Saque" 
                + "\n [2] - Deposito"
                + "\n [3] - Transfer�ncia" 
                + "\n [4] - Relat�rio de tribu��o" 
                + "\n [5] - Saldo" 
                + "\n [6] - Close"
                + "\n [7] - Relat�rios de clientes" 
                + "\n [8] - Relat�rios gerais";

    }
}