package src.com.Aula05;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo){
        super(saldo);
    }


    @Override
    public void credito(Double valor){
        String opane = JOptionPane.showInputDialog("Digite quanto você deseja depositar :");
        double deposito = Double.parseDouble(opane);
        this.saldo += deposito;
        System.out.println("Seu saldo é : " + this.saldo);
    }

    @Override
    public void debito(Double valor){
        
        if (this.saldo < valor){           
          System.out.println("Você n tem esse dinheiro não, maluco, relaxa aí !");
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Seu saldo é : " + this.saldo);
        }
    }

    @Override
    public void saldo(Double valor){
        System.out.println("Seu saldo é : " + this.saldo);
    }
    
}
