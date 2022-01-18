package lavoro13.src;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lavoro13 {
    public static void main(String[] args) throws Exception {
        Scanner scannerNumeri = new Scanner(System.in);

        JOptionPane.showInputDialog("inserisci la media dei voti...[0...10]");

        System.out.print("Inserici il tuo voto -> ");
        int mioVoto = scannerNumeri.nextInt();

        scannerNumeri.close();

        // per essere ammesso devi avere almeno 5
        if (mioVoto >= 5)
        {
            System.out.println("Amesso...");

            if (mioVoto <= 6)
            {
                System.out.println("Fascia pericolante");
            }
            else
            {
                if (mioVoto <= 8)
                {
                    System.out.println("Discreto");
                }
                else
                {
                    System.out.println("Eccelente...");
                }
            }
        }
        else
        {
            System.out.println("Non ammesso...");
        }    
    }
}
