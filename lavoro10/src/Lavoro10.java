package lavoro10.src;

import java.util.Scanner;

public class Lavoro10 {
    public static void main(String[] args) throws Exception {
        /*
            Ripetete l’esercizio 1.4, senza utilizzare prodotto e divisione. 
            Suggerimento: combinate in maniera opportuna gli algoritmi ottenuti per risolvere gli esercizi 1.2 e 1.4. 
        */

        int base = 0, esponente = 0, risultato = 1;

        Scanner scannerNumeri = new Scanner(System.in);

        System.out.print("Inserisci la base -> ");
        base = scannerNumeri.nextInt();

        System.out.print("Inserisci l'esponente -> ");
        esponente = scannerNumeri.nextInt();

        scannerNumeri.close();

        for(int i = 1; i <= esponente; i++)
        {
            int ris = 0;
            for (int k = 1; k <= base; k++)
            {
                ris = ris+risultato;
            }
            risultato=ris;
        
        }

        System.out.println(risultato);
    }
}
