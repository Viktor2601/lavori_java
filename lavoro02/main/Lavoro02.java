package lavoro02.main;

import java.util.Scanner;

public class Lavoro02 
{
    public static void main(String[] args)
    {
        /*
        String[] nomi = {"Luca", "Marco", "Gianni", "Gilberto"};

        System.out.println(nomi[2]);
        System.out.println(nomi[1]);
        System.out.println(nomi.length); // nomi.length -> lunghezza del array

        for (int i=0; i < nomi.length; i++)
        {
            String msg = (i+1) + ") " + nomi[i];
            System.out.println(msg);
        }
        */

        String nomi[]; // crezione di un array vuoto
        
       
        // creo un scanner per leggere i dati in input di tipo numerico
        Scanner ln = new Scanner(System.in);

        // chiedo al utente la dimensione del array
        System.out.print("Quanti nomi vuoi inserire -> ");
        int quanti = ln.nextInt();
        
        
        // creaione del array con la lunghezza voluta dal utente
        nomi = new String[quanti];

        // creo uno scanner che servià a leggere i dati in input di tipo stringa 
        Scanner ls = new Scanner(System.in);

        // ciclo che serve a caricare i nomi nel array
        for (int i=0; i < nomi.length; i++)
        {
            String msg = "Inserisci un nome (" + (i+1) + "/" + nomi.length + ") -> ";
            System.out.print(msg);
            nomi[i] = ls.nextLine();     
        }

        // chiusura dello scanner per le stringhe
        ls.close();
        ln.close();
        

        // ciclo che serve a stampare i nomi presenti dentro al array
        for (int i=0; i < nomi.length; i++)
        {
            String msg = (i+1) + ") " + nomi[i];
            System.out.println(msg);
        }

        
    }    
}
