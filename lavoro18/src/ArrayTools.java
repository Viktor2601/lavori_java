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

    public static int[] unisciArray (int array1[], int array2[])
    {
        int arrayUnito[] = new int[array1.length + array2.length];
        int lunghezzaArray1 = array1.length;
        int lunghezzaArray2 = array2.length;

        for (int i = 0; i < lunghezzaArray1; i++)
        {
            arrayUnito[i] = array1[i];
        }
        
        for (int i =0; i < lunghezzaArray2; i++)
        {
            arrayUnito[i+lunghezzaArray1] = array2[i];
        }

        return arrayUnito;
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

    public static int[] numeriInComune (int array1[], int array2[])
    {
        int risultato[] = {};

        for (int n : array1)
        {
            if (ricercaNumero(risultato, n) == true)
            {
                continue;
            }

            if (ricercaNumero(array2, n) == true)
            {
                int tmp[] = new int[1];
                tmp[0] = n;
                risultato = unisciArray(risultato, tmp);
            }
        }

        return risultato;
    }

    public static boolean contieneValori (int array1[], int array2[])
    {
        boolean contieneValori = true;

        for (int numero : array2)
        {
            if (ricercaNumero(array1, numero) == false)
            {
                contieneValori = false;
                break;
            }
        }

        return contieneValori;
    }

    /**
     * ritorna l'indice dell'elemento trovato altrimenti -1
     * @param array
     * @param numeroDaCercare
     * @return 
     */
    public static int ricercaIndice (int array[], int numeroDaCercare)
    {
       return ricercaIndice(array, numeroDaCercare, 0);
    }

    public static int ricercaIndice (int array[], int numeroDaCercare, int start)
    {
       for (int indice = start; indice < array.length; indice++)
       {
           if (array[indice] == numeroDaCercare)
           {
               return indice;
           }
       }

       return -1;
    }

    public static boolean contieneSequenza (int array1[], int array2[])
    {
        boolean contieneSequenza =false;

        if (array2.length == 0)
        {
            return false; 
        }

        if (array2.length > array1.length)
        {
            return false;
        }
        
        int numero = array2[0];
        int start =ricercaIndice(array1, numero);

        while (start != -1 && array1.length >= array2.length+start && !contieneSequenza)
        {
            contieneSequenza = true;
            for (int i = 0; i < array2.length; i++)
            {
                if (array1[start+i] != array2[i])
                {
                    contieneSequenza = false;
                    break;
                }
            }
            start =ricercaIndice(array1, numero, start + 1);
        }

        return contieneSequenza;
    }


}