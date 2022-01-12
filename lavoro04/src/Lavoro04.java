package lavoro04.src;

import java.util.Scanner;


public class Lavoro04 
{
    public static void main(String[] args) throws Exception 
    {
        /*
            Creazione di una calcolatrice che può svolgere le seguenti opereazioni:
            -somma
            -sottrazione
            -moltiplicazione
            -divisione
            Può ricevere solo due numeri in input
        */

        // messaggio di benvenuto e spiegazione al utente di come funziona la calcolatrice
        String msg_benvenuto = """
                                    Benvenuto nel app Calcolatrice!!
                                    La Calcolatrice può svolgere le seguenti operazioni:
                                    1) Somma (+)
                                    2) Sottrazione (-)
                                    3) Moltiplicazione (*)
                                    4) Divisone (/)
                                    Le auguro un buon proseguo...""";
        System.out.println(msg_benvenuto);

        // creazione di un oggetto Scanner che serve a leggere i dati in input ricevuti dal utente 
        Scanner s_numeri = new Scanner(System.in);

        // crezione di due variabili n1 e n2 che servono ad immagazzianare i valori ricevuti in input
        System.out.print("Inserisci il primo numero -> ");
        int n1 = s_numeri.nextInt();
        System.out.print("Inserisci il secondo numero -> ");
        int n2 = s_numeri.nextInt();

        // chiedo al utente quale operazione vuole fare e fare riferimento al numero per effettuare la selezione
        String msg_operazioni = """
                                    Quale operazione vuoi fare: 
                                    1) Somma (+)
                                    2) Sottrazione (-)
                                    3) Moltiplicazione (*)
                                    4) Divisone (/)
                                    Inserisci il numero del operazione che vuoi svolgere -> """;
        System.out.print(msg_operazioni);
        int operazione = s_numeri.nextInt();

        s_numeri.close();

        // dichiaro una variabile risulatato
        int risulatato;
        String msg_risultato;

        // utilizzando il costrutto switch faccio fare al programma l'opereazione selezionata dal utente
        switch(operazione)
        {
            // caso somma
            case 1:
                risulatato = n1 + n2;
                msg_risultato = "Il risultato della somma tra " + n1 + " e " + n2 + " è " + risulatato;
                System.out.println(msg_risultato);
                break;
            
            // caso sottrazione
            case 2:
                risulatato = n1 - n2;
                msg_risultato = "Il risultato della sottrazione tra " + n1 + " e " + n2 + " è " + risulatato;
                System.out.println(msg_risultato);
                break;
            
            // caso moltiplicazione
            case 3:
                risulatato = n1 * n2;
                msg_risultato = "Il risultato della moltiplicazione tra " + n1 + " e " + n2 + " è " + risulatato;
                System.out.println(msg_risultato);
                break;
            
            // caso divisione
            case 4:
                risulatato = n1 / n2;
                msg_risultato = "Il risultato della divisione tra " + n1 + " e " + n2 + " è " + risulatato;
                System.out.println(msg_risultato);
                break;
            
            // caso che non venga selezionata una delle opzioni precedenti
            default:
                String msg_errore = """
                                        Siamo spiacenti la scelta che hai selezionato non è valida. 
                                        Grazie mille del utilizzo del applicazione e arrivederci !!
                                    """;
                System.out.println(msg_errore);
                break;
        }

        


    }
}
