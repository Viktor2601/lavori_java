package lavoro15.src;

import java.util.Scanner;

public class Lavoro15 
{
    /*
        Un numero naturale si dice perfetto se `e uguale alla somma dei suoi divisori propri. Ad esempio i primi due numeri perfetti 
        sono 6 (= 1+2+3) e 28 (= 1+2+4+7+14). Un numero si dice difettivo se `e maggiore della somma dei suoi divisori propri, ad esempio 
        il numero 10 (> 1 + 2 + 5). Un numero si dice abbondante se `e minore della somma dei suoi divisori propri, ad esempio il numero 12 (< 1 + 2 + 3 + 4 + 6). 
        Utilizzando le strutture di controllo fondamentali esprimete due algoritmi per svolgere i seguenti compiti: 
        1. Leggere un numero e stabilire se `e perfetto, difettivo o abbondante. 
        2. Leggere un numero n e produrre: 
            • un elenco di tutti i numeri perfetti ≤ n, 
            • un elenco di tutti i numeri difettivi ≤ n, 
            • un elenco di tutti i numeri abbondanti ≤ n.
    */
    public static void main(String[] args) throws Exception 
    {
        Scanner scannerNumeri = new Scanner(System.in);

        int divisoriPropri[] = new int[100];

        System.out.print("Inserisci un numero -> ");
        int numero = scannerNumeri.nextInt();

        scannerNumeri.close();

        int contatore = 1;
        int sommaDivisori = 0;

        while (contatore < numero)
        {
            if (numero % contatore == 0)
            {
                divisoriPropri[contatore-1] = contatore;
                sommaDivisori += contatore;
            }

            contatore++;
        }

        if (sommaDivisori == numero)
        {
            System.out.println("Perfetto");
        }
        else
        {
            if (sommaDivisori > numero)
            {
                System.out.print("Abbondante");
            }
            else
            {
                System.out.println("Diffettivo");
            }
        }
    }
}
