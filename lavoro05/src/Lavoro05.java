package lavoro05.src;

import java.util.Scanner;


public class Lavoro05 {
    public static void main(String[] args) throws Exception {
        
        /*  
            Ricevi in input dellle parole. 
            Ti fermi di riceverle quando l'utente digita stop
            In output devi dare tutte le parole con più di 5 caratteri
        */

        String msgBenvenuto = "Benvenuto.... Inserisci tutte le parole che vuoi!!" +
                                " Per terminare digitare FINE...";
        System.out.println(msgBenvenuto);

        String parole[] = new String [100];

        Scanner scannerParole = new Scanner(System.in);

        boolean condizione = true;

        int contatore = 0;

        while (condizione)
        {
            System.out.print("Inserisci la parola -> ");
            String parola = scannerParole.nextLine();

            if (parola.equalsIgnoreCase("fine"))
            {
                String msgUscita = "Hai finito di inserire parole...";
                System.out.println(msgUscita);
                condizione = false;
            }
            else
            {
                parole [contatore] = parola;
                contatore++;

            }
            
        }

        scannerParole.close();

        String msg = "Queste sono le parole con più di 5 caratteri:";
        System.out.println(msg);

        for (String parola : parole)
        {
            if (parola.length() > 5)
            {
                msg = "-" + parola + "(ha " + parola.length() + " caratteri)";
                System.out.println(msg);
            }
            
             if (parola.isEmpty() == true)
            {
                break;
            }
        }
        
    }
}
