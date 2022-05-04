package src.com.Aula05;
import java.util.Scanner;

public abstract class Conta{
    static Scanner input = new Scanner(System.in);

    protected double saldo;

    public Conta(double valor) {
        this.saldo = valor;
    }

    abstract void credito(Double valor);
    abstract void debito(Double valor);
    abstract void saldo(Double valor);


}