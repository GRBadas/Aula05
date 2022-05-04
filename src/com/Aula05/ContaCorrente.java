package src.com.Aula05;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo){
        super(saldo);
    }

    @Override
    public void credito(Double saldo){
        String opane = JOptionPane.showInputDialog("Digite quanto você deseja depositar :");
        double deposito = Double.parseDouble(opane);
        this.saldo += deposito;
        System.out.println("Seu saldo é : " + this.saldo);
    }

    @Override
    public void debito(Double saldo){
        String opane = JOptionPane.showInputDialog("Digite quanto você deseja sacar :");
        double saque = Double.parseDouble(opane);
        if (this.saldo < saque){           
          System.out.println("Você n tem esse dinheiro não, maluco, relaxa aí !");
        } else {
            this.saldo -= saque;
            System.out.println("Seu saldo é : " + this.saldo);
        }
    }

    @Override
    public void saldo(Double saldo){
        System.out.println("Seu saldo é : " + this.saldo);
    }
    
}
