package src.com.Aula05;

import javax.swing.JOptionPane;

public class MenuBody {

    public void mostrarMenu(){

        String opt = JOptionPane.showInputDialog("Digite a opção que você deseja acessar :");
        switch(opt){
            case "1":
            System.out.println("Digite os dados da sua nova conta");
            case "2":
            System.out.println("");
            default:
            break;
    
        }
    } 

    public void fazerSaque(Conta conta){
        String opane = JOptionPane.showInputDialog("Digite quanto você deseja depositar :");
        double saque = Double.parseDouble(opane);
        conta.debito(saque);
    }

    public void fazerDeposito(){
        double depositoValor = GUIUsuario.getUserDouble("Digite o quanto vc deseja sacar: ");
        
    }
}
