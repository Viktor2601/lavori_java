package lavoro07.src;

import java.util.Scanner;

public class Lavoro07 
{
    /*
        Esprimete di controllo fondamentali un algoritmo per il calcolo del prodotto di due numeri interi, utilizzando esculusivamente operazioni di somma
    */
    public static void main(String[] args) throws Exception 
    {
        int numero1 = 0, numero2 = 0, risultato = 0;

        Scanner scannerNumeri = new Scanner(System.in);

        String msgBenvenuto = "Inserisci due numeri per svolgere una moltiplicazione...";
        System.out.println(msgBenvenuto);

        System.out.print("Inseirsci il primo nuemro -> ");
        numero1 = scannerNumeri.nextInt();

        System.out.print("Inseirsci il secondo nuemro -> ");
        numero2 = scannerNumeri.nextInt();

        scannerNumeri.close();

        for (int i = 0; i < numero2; i++)
        {
            risultato = risultato + numero1;
        }

        String msgOutput = "Il risulato tra " + numero1 + "*" + numero2 + "=" + risultato;
        System.out.println(msgOutput);



        
    }
}
