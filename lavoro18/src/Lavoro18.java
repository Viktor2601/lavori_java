package lavoro18.src;

public class Lavoro18 
{
    public static void main(String[] args) throws Exception 
    {
        int input[] = ArrayTools.generaArrayCasuale(4, 100);
        int input2[] = ArrayTools.generaArrayCasuale(4, 100);

        int inputOrdinato[] = ArrayTools.ordinaCrescente(input);
        int inputUnito[] = ArrayTools.unisciArray(input, input2);


        ArrayTools.stampaArray(input);
        System.out.println("------------------------------------------------------");
        ArrayTools.stampaArray(input2);
        System.out.println("------------------------------------------------------");
        ArrayTools.stampaArray(inputUnito);
        System.out.println("------------------------------------------------------");
        ArrayTools.stampaArray(inputOrdinato);

        System.out.println("MAX -> " + ArrayTools.max(input));
        System.out.println("MIN -> " + ArrayTools.min(input));
        System.out.println("MEDIA -> " + ArrayTools.media(input));
        System.out.println("TROVATO -> " + ArrayTools.ricercaNumero(input, 101));
   
        System.out.println("------------------------------------------------------");
        int array1[] = {1,2,3,4};
        int array2[] = {3,4,5,6,4};
        int arrayComune[] = ArrayTools.numeriInComune(array1, array2);
        ArrayTools.stampaArray(arrayComune);
    }
}
