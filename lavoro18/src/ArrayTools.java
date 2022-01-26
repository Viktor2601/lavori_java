 package lavoro18.src;

import java.util.Random;

public class ArrayTools 
{
    public static void stampaArray (int numeri[])
    {
        for (int numero : numeri)
        {
            System.out.println(numero);
        }
    }
    public static boolean ricercaNumero (int numeri[], int numeroDaCercare)
    {
        boolean trovato = false;
        int indice = 0;

        while (indice < numeri.length-1 && !trovato)
        {
            if (numeri[indice] == numeroDaCercare)
            {
                trovato = true;
            }

            indice++;
        }

        return trovato;    
    }

    public static int max (int numeri[])
    {
        int max = numeri[0];

        for (int numero: numeri)
        {
            if (numero > max)
            {
                max = numero;
            }
        }

        return max;
    }

    public static int min (int numeri[])
    {
        int min = numeri[0];

        for (int numero: numeri)
        {
            if (numero < min)
            {
                min = numero;
            }
        }

        return min;
    }

    public static double media (int numeri[])
    {
        double media = 0;
        double somma = 0;
        int indice = 0;

        for (int numero : numeri)
        {
            somma += numero;
            indice++;
        }

        media = somma / indice;

        return media;
    }

    public static int[] ordinaCrescente (int numeri[])
    {
        int arrayOrdinato[] = copiaArray(numeri);

        for (int s = 0; s < arrayOrdinato.length-1; s++)
        {
            for (int i = 0; i < arrayOrdinato.length-1; i++)
            {
                if (arrayOrdinato[i] > arrayOrdinato[i+1])
                {
                    int appoggio = arrayOrdinato[i];
                    arrayOrdinato[i] = arrayOrdinato[i+1];
                    arrayOrdinato[i+1] = appoggio; 
                }
            }
        }

        return arrayOrdinato;
    }

    public static int[] copiaArray (int arrayDaCopiare[])
    {
        int copia[] = new int [arrayDaCopiare.length];

        for (int i = 0; i < arrayDaCopiare.length; i++)
        {
            copia[i] = arrayDaCopiare[i];
        }

        return copia;
    }

    public static int[] generaArrayCasuale (int grandezzaArray, int numeroMax)
    {
        int risultato[] = new int[grandezzaArray];
        
        for (int i = 0; i < grandezzaArray; i++)
        {
            risultato[i] = generaNumeroCasuale(numeroMax);
        }

        return risultato;
    }

    public static int generaNumeroCasuale (int max)
    {
        Random random = new Random();
        return random.nextInt(max);
    }
}