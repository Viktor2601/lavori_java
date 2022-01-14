package lavoro08.src;

import java.util.Scanner;

public class Lavoro08
{
    /*
        Esprimete con le strutture di controllo fondamentali un algoritmo per il calcolo del quoziente è del resto della divisione tra due numeri interi,
        utilizzando esclusivamente operazioni di somma e sottrazione. Ad esempio, se in ingresso vengono forniti i valori 13 e 4, in uscita dovranno essere
        restituiti i valori 3 e 1. Si supponga che i numeri inseriri siano positivi 
    */
    public static void main(String[] args) throws Exception 
    {
        int dividendo = 0, divisore = 0, resto = 0, quoziente = 0;

        Scanner scannerNumeri = new Scanner(System.in);

        System.out.print("Inserisci il dividendo -> ");
        dividendo = scannerNumeri.nextInt();

        System.out.print("Inserisci il divisore numero -> ");
        divisore = scannerNumeri.nextInt();

        scannerNumeri.close();

        resto = dividendo;
        if (divisore != 0)
        {
            while (resto-divisore >= 0)
            {
                resto = resto - divisore;
                quoziente++;
            }

            String msgOutput = "Il risultato della divisone fra " + dividendo + "/" + divisore + "=" + quoziente + ". E da di resto " + resto;
            System.out.println(msgOutput);
        }
        else
        {
            System.out.println("Mi dispiace ma 0 come divisore non va bene... il risultato sarebbe infinito...");
        }
    }
}
