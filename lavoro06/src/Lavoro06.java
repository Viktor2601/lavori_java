package lavoro06.src;

import java.util.Scanner;

public class Lavoro06 
{
    /*
     * Esprimete con le strutture di controllo fondamentali un algoritmo per il
     * calcolo della somma di
     * tutti i numeri interi compresi tra x e y, estremi inclusi, dove x e y sono
     * due interi forniti dall’utente.
     * Se ad esempio l’utente fornisce 3 e 8 il risultato dovr`a essere 33. Nella
     * prima versione supponete
     * che l’utente fornisca i numeri in ordine non decrescente. Nella seconda
     * versione l’algoritmo deve
     * calcolare la somma indipendentemente dall’ordine: se l’utente fornisce prima
     * 8 e poi 3 il risultato
     * deve essere di nuovo 33.
     */
    public static void main(String[] args) throws Exception 
    {
        int primoEstremo = 0, secondoEstremo = 0, risultato = 0;

        Scanner scannerNumeri = new Scanner(System.in);

        String msgBenvenuto = "Inserisci due numeri di cui verrà fatta la somma dei numeri compresi fra i due numeri dati dal utente estremi compresi";
        System.out.println(msgBenvenuto);

        System.out.print("Inserisci il primo estremo -> ");
        primoEstremo = scannerNumeri.nextInt();

        System.out.print("Inserisci il secondo estremo -> ");
        secondoEstremo = scannerNumeri.nextInt();

        if (primoEstremo > secondoEstremo) 
        {
            int appoggio = 0;
            appoggio = primoEstremo;
            primoEstremo = secondoEstremo;
            secondoEstremo = appoggio;
        } 
        scannerNumeri.close();

        for (int contatore = primoEstremo; contatore <= secondoEstremo; contatore++) 
        {
            risultato = risultato + contatore;
        }

        String msgOutput = "Il risultato della somma dei numeri compresi tra " + primoEstremo + " e " + secondoEstremo
                + " è " + risultato;
        System.out.println(msgOutput);
    }
}
