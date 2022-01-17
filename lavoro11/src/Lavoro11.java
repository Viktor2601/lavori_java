package lavoro11.src;

import java.util.Scanner;

public class Lavoro11 
{
    /*
        Esprimete con le strutture di controllo fondamentali un algoritmo per il calcolo della somma di una sequenza di 
        interi fornita in ingresso dall’utente. 
        Si supponga che l’inserimento di 0 indichi il termine della sequenza. 
    */
    public static void main(String[] args) throws Exception 
    {
        int numeri[] = new int[100];

        Scanner scannerNumeri = new Scanner(System.in);

        boolean uscita = true;

        int contatore = 0;

        int risultato = 0; 

        String msgBenvenuto = """
                                    Benvenuto!!!
                                    Inserisci dei numeri e noi ti faremo la somma....
                                    Per smetttere di inserire dei numeri inserire lo 0 (zero)...    """;
        System.out.println(msgBenvenuto);

        do 
        {
            System.out.print("Inserisci un numero ->");
            numeri[contatore] = scannerNumeri.nextInt();

            if (numeri[contatore] == 0 )
            {
                uscita = false;
            }

            contatore++;


        } while(uscita==true || contatore == 100);

        scannerNumeri.close();

        for (int numero : numeri)
        {
            risultato += numero;
        }

        String msgOutput = "Il risultato della somma dei numeri ricevuti in input è " + risultato;
        System.out.println(msgOutput);
        
    }
}
