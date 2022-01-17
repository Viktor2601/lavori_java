package lavoro12.src;

import java.util.Scanner;


public class Lavoro12 
{
    /*
        Esprimete con le strutture di controllo fondamentali un algoritmo per il calcolo della media di tutti i numeri pari e della media di tutti i numeri dispari 
        in una sequenza di interi, fornita in ingresso dall’utente. 
        Si supponga che l’inserimento di 0 indichi il termine della sequenza (0 non fa parte della sequenza). 
        Si indichi infine quale delle due medie `e pi`u grande. 
    */
    public static void main(String[] args) throws Exception 
    {
        int numeri[] = new int[100];
        int numeriPari[] = new int [100];
        int numeriDispari[] = new int [100];

        Scanner scannerNumeri = new Scanner(System.in);

        int contatore = 0;
        int contatoreNumeriPari = 0;
        int contatoreNumeriDispari = 0;

        boolean uscita = true;

        String msgBenvenuto = """
                                    Benvenuto!!!
                                    Inserisci dei numeri e noi ti faremo la media dei numeri pari e dei numeri dispari...
                                    E ti diremo quale delle due medie è più grande...
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
            else
            {
                if (numeri[contatore] % 2 == 0)
                {
                    numeriPari[contatoreNumeriPari] = numeri[contatore];
                    contatoreNumeriPari++;
                }
                else
                {
                    numeriDispari[contatoreNumeriDispari] = numeri[contatore];
                    contatoreNumeriDispari++;
                }
            }

            contatore++;

        } while(uscita==true || contatore == 100);

        scannerNumeri.close();

        int sommaPari = 0;
        int mediaPari = 0;

        for (int pari : numeriPari)
        {
            if (pari != 0)
            {
               sommaPari = sommaPari + pari;
            }
            else
            {
                break;
            }   
        }

        mediaPari = sommaPari / contatoreNumeriPari;
        
        int sommaDispari = 0;
        int mediaDispari = 0;

        for (int dispari : numeriDispari)
        {
            if (dispari != 0 )
            {
                sommaDispari = sommaDispari + dispari;
            }
            else
            {
                break;
            }
        }

        mediaDispari = sommaDispari / contatoreNumeriDispari;
        
        if (mediaPari > mediaDispari)
        {
            String msgOutput ="""
                                    La media più alta è quella dei numeri pari...
                                    Perchè la media nei numeri pari è """ + mediaPari +  " mentre quella nei nuermi dispari è " + mediaDispari;
            System.out.println(msgOutput);
        }
        else
        {
            String msgOutput ="""
                                    La media più alta è quella dei numeri dispari...
                                    Perchè la media nei numeri dispari è """ + mediaDispari +  " mentre quella dei nuermi pari è " + mediaPari;
            System.out.println(msgOutput);
        }


    }
}
