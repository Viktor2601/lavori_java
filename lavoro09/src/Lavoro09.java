package lavoro09.src;

import java.util.Scanner;

public class Lavoro09 
{
    /*
        Esprimete con le strutture di controllo fondamentali un algoritmo per il calcolo della potenza xy di due numeri interi x e y, 
        utilizzando esclusivamente le 4 operazioni di somma, sottrazione, prodotto e divisione. Si supponga y ≥ 0. 
    */
    public static void main(String[] args) throws Exception 
    {
        int base = 0, esponente = 0, risultato = 1;

        Scanner scannerNumeri = new Scanner(System.in);

        System.out.print("Inserisci la base -> ");
        base = scannerNumeri.nextInt();

        System.out.print("Inserisci l'esponente -> ");
        esponente = scannerNumeri.nextInt();

        scannerNumeri.close();
        
        for(int contatore =0; contatore < esponente; contatore++)
        {
            risultato = risultato *base;
        }
        
        String msgOutput = "Il risultato del elevamento a potenza fra " + base + " e " + esponente + " è uguale a " + risultato;
        System.out.println(msgOutput);
    
    }
}
