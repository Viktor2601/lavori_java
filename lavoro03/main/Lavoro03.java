package lavoro03.main;

import java.util.Scanner;

public class Lavoro03 
{
    public static void main (String[] args)
    {
        // dati due numeri in input dire quale è il maggiore 
        int n1, n2;

        // oggetto che fa da scanner e legeg i dati in input 
        Scanner s = new Scanner(System.in);

        // chiedo al utente il primo numero e lo assegno alla variabile n1
        System.out.print("Inserisci il primo numero -> ");
        n1 = s.nextInt();

        // chiedo al utente il secondo numero e lo assegno alla variabile n2
        System.out.print("Inserisci il secondo numero -> ");
        n2 = s.nextInt();

        // confronto i due numeri e dico qual è il più grande o se sono uguali 

        if (n1 > n2)
        {
            String msg = "Il nuemro più grande fra " + n1 + " e " + n2 +" è " + n1;
            System.out.println(msg);
        }
        else 
        {
            if (n2 > n1)
            {
                String msg = "Il nuemro più grande fra " + n1 + " e " + n2 +" è " + n2;
                System.out.println(msg);
            }
            else
            {
                String msg = "I due numei sono uguali, il numero è " + n1 ;
                System.out.println(msg);
            }
        }

        // ricevuto in input un numero dire se è pari e dispari
        
        int n3; // variabile che conterrà il numero ricevuto in input
        
        // chiedo al utente un numero e lo assegno alla variabile n3
        System.out.print("Inserisci un numero -> ");
        n3 = s.nextInt();

        s.close();

        // verifico se il numero e pari o dispari 
        if (n3 % 2 == 0)
        {
            String msg = "Il numero " + n3 + " è un numero pari";
            System.out.println(msg);
        }
        else 
        {
            String msg = "Il numero " + n3 + " è un numero dispari";
            System.out.println(msg);
        }
    }
    
}
