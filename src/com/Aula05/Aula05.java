package src.com.Aula05;

import java.util.Scanner;

public class Aula05{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){


        ContaCorrente c1 = new ContaCorrente(0);
        
        c1.credito(0.0);
        c1.debito(0.0);
        c1.saldo(0.0);
        
        input.close();
    }
}

